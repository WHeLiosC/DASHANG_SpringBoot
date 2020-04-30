package com.dashang.mapper;

import com.dashang.entity.TableName;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
public interface NumMapper {
    //搜索某个表的数量
    @Select("select count(*) from ${name}")
    int getNum(TableName tableName);

    @Select("select count(*) from user where USER_TYPE = 3")
    int getFirmNum();
}
