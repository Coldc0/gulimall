package com.gulimall.member.dao;

import com.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 *
 * @author Shen
 * @email zhangshen2201@hotmail.com
 * @date 2021-01-22 20:38:37
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {

}
