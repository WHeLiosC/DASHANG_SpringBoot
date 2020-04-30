package com.dashang.mapper;


import com.dashang.entity.UserMesg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMesgMapper {
    @Select("select * from usermessage")
    List<UserMesg> getAll();

    @Select("select u.USER_ID, u.USER_NAME, um.CID, um.ADDRESS, um.TEL_NUMBER, um.EMAIL, um.PIC from userMessage um join user u on um.USER_ID = u.USER_ID where u.USER_TYPE = 3")
    List<UserMesg> getFirm();
}
