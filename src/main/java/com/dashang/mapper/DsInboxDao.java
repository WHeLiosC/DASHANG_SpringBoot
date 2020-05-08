package com.dashang.mapper;


import com.dashang.model.*;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DsInboxDao {
    int deleteByPrimaryKey(Integer mailId);

    int insert(DsInbox record);

    int insertSelective(DsInbox record);

    DsInbox selectByPrimaryKey(Integer mailId);

    int updateByPrimaryKeySelective(DsInbox record);

    int updateByPrimaryKey(DsInbox record);

    int selectUnReadNum(String name);

    int selectMailNum(String name);

    Page<DsInbox> selectInbox(Integer userId);
}