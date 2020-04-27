package com.ds.demo.controller;

import com.ds.demo.entity.Task;
import com.ds.demo.mapper.TaskMapper;
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
