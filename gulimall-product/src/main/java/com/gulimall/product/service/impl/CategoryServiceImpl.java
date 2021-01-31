package com.gulimall.product.service.impl;

import com.gulimall.product.dao.CategoryDao;
import com.gulimall.product.entity.CategoryEntity;
import com.gulimall.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gulimall.common.utils.PageUtils;
import com.gulimall.common.utils.Query;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //1. 查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);
        //2. 组装成树形结构
        //  2.1 找到所有的一级分类
        List<CategoryEntity> level1Menus = entities.stream()
                .filter((categoryEntity -> categoryEntity.getCatLevel() == 1))
                .map((menu) -> {
                    List<CategoryEntity> childrens = getChildrens(menu, entities);
                    menu.setChildren(childrens);
                    return menu;
                })
                .sorted(Comparator.comparingInt(o -> (o.getSort() == null ? 0 : o.getSort())))
                .collect(Collectors.toList());
        return level1Menus;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        //TODO:检查当前被删除的菜单是否被引用
        baseMapper.deleteBatchIds(asList);
    }

    private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all) {
        List<CategoryEntity> children = all.stream()
                .filter(
                        categoryEntity -> categoryEntity.getParentCid().equals(root.getCatId()))
                .map(categoryEntity -> {
                    categoryEntity.setChildren(getChildrens(categoryEntity, all));
                    return categoryEntity;
                })
                .sorted(Comparator.comparingInt(o -> (o.getSort() == null ? 0 : o.getSort())))
                .collect(Collectors.toList());
        return children;
    }
}