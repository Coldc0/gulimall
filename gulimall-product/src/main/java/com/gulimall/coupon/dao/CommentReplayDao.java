package com.gulimall.coupon.dao;

import com.gulimall.coupon.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author Shen
 * @email zhangshen2201@hotmail.com
 * @date 2021-01-22 12:54:25
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {

}
