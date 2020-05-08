package com.dashang.mapper;

import com.dashang.model.User;
import com.dashang.model.UserDomain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserDomain> getUser();

    // 登录
    User login(User user);

    // 注册
    void register(User user);        // 如果用户名可用，则进行注册
    User isExist(User user);         // 用户名是否存在，不存在则可注册
    void insertUserId(User user);    // 在增加用户记录的同时将userId加入到usermessage表

    // 修改用户信息
    UserDomain haveDetail(UserDomain ud);
    void updateDetail(UserDomain ud);
    void addDetail(UserDomain ud);

    UserDomain getUserInfo(Integer userId);

    // 查询用户信息
    int selectUserID(String name);
    int selectUserIdByEmail(String email);
    String selectUserNameByEmail(String email);
}
