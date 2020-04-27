package com.dashang.controller;

import com.dashang.entity.TableName;
import com.dashang.mapper.NumMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetNumController {
    @Autowired
    NumMapper numMapper;

    @RequestMapping(value = "/getNum", method = RequestMethod.POST)
    public int getNum(@RequestBody TableName tableName){
        System.out.println("!!!!!!!!!!!!!"+tableName.getTableName());
        return numMapper.getNum(tableName);
    }
}
