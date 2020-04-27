package com.ds.demo.mapper;

import com.ds.demo.Message.Mesg;
import com.ds.demo.entity.*;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface NumMapper {
    //搜索所有商品
    @Select("select count(*) from ${name}")
    int getNum(TableName tableName);
}
