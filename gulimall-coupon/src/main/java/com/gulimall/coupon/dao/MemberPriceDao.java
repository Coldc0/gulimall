package com.gulimall.coupon.dao;

import com.gulimall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 *
 * @author Shen
 * @email zhangshen2201@hotmail.com
 * @date 2021-01-22 16:32:09
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {

}
