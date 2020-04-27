package com.dashang.controller;

import com.dashang.entity.Task;
import com.dashang.mapper.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetTaskController {
    @Autowired
    TaskMapper taskMapper;

    @RequestMapping(value = "/getTask", method = RequestMethod.POST)
    public List<Task> getPurchase(){
        return taskMapper.getAll();
    }
}
