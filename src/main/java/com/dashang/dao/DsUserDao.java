package com.dashang.dao;


import com.dashang.entity.DsUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DsUserDao {
    int deleteByPrimaryKey(Integer userId);

    int insert(DsUser record);

    int insertSelective(DsUser record);

    DsUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(DsUser record);

    int updateByPrimaryKey(DsUser record);

    DsUser selectUserByRealName(String name);

    String selectPasswordByName(String name);

    int selectUserID(String name);

    int selectUserIdByEmail(String email);

    String selectUserNameByEmail(String email);
}