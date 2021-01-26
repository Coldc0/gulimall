package com.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;

/**
 * spu信息介绍
 *
 * @author Shen
 * @email zhangshen2201@hotmail.com
 * @date 2021-01-22 12:54:24
 */
@Data
@TableName("pms_spu_info_desc")
public class SpuInfoDescEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 商品id
     */
    @TableId
    private Long spuId;
    /**
     * 商品介绍
     */
    private String decript;

}
