package cn.zptc.ai.dao;

import cn.zptc.ai.entity.Link;

public interface LinkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Link record);

    int insertSelective(Link record);

    Link selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Link record);

    int updateByPrimaryKey(Link record);
}