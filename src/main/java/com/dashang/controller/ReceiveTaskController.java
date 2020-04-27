package com.dashang.controller;

import com.dashang.Message.Mesg;
import com.dashang.mapper.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceiveTaskController {
    @Autowired
    TaskMapper taskMapper;

    @RequestMapping(value = "/receiveProduct", method = RequestMethod.POST)
    public Mesg receiveProduct(@RequestBody Mesg mesg){
        if(!taskMapper.getThis1(mesg).isEmpty()){
            taskMapper.delTask(mesg);
            return new Mesg("1");
        }
        else{
            return new Mesg("0");
        }
    }
}
