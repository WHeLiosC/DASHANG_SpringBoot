package com.dashang.mapper;


import com.dashang.model.*;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DsSentDao {
    int deleteByPrimaryKey(Integer sentId);

    int insert(DsSent record);

    int insertSelective(DsSent record);

    DsSent selectByPrimaryKey(Integer sentId);

    int updateByPrimaryKeySelective(DsSent record);

    int updateByPrimaryKey(DsSent record);

    Page<DsSent> selectSent(int userId);

    int selectSentNum(String name);
}