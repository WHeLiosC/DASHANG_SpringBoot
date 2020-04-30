package com.dashang.controller;

import com.dashang.entity.Page;
import com.dashang.entity.Task;
import com.dashang.mapper.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetTaskController {
    @Autowired
    TaskMapper taskMapper;

    @RequestMapping(value = "/getTask", method = RequestMethod.POST)
    public List<Task> getPurchase(@RequestBody Page page){
        int num = page.getPageNum();
        int size = page.getPageSize();
        List<Task> list = taskMapper.getAll();
        if((num-1)*size<list.size())
            return list.subList((num-1)*size,Math.min(num*size,list.size()));
        else
            return null;
    }
}
