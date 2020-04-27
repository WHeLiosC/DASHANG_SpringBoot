package com.dashang.controller;

import com.dashang.entity.Page;
import com.dashang.entity.UserMesg;
import com.dashang.mapper.UserMesgMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GetFirmController {
    @Autowired
    UserMesgMapper userMesgMapper;

    @RequestMapping(value = "/getFirm", method = RequestMethod.POST)
    public List<UserMesg> getFirm(@RequestBody Page page){
        int num = page.getPageNum();
        int size = page.getPageSize();
        List<UserMesg> list = userMesgMapper.getFirm();
        if((num-1)*size<list.size())
            return list.subList((num-1)*size,Math.min(num*size,list.size()));
        else
            return new ArrayList<UserMesg>();
    }
}
