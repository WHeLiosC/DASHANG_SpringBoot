package com.ds.demo.controller;

import com.ds.demo.Message.Mesg;
import com.ds.demo.mapper.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.plugin2.message.Message;

@RestController
public class RefuseTaskController {
    @Autowired
    TaskMapper taskMapper;

    @RequestMapping(value = "/refuseTask", method = RequestMethod.POST)
    public Mesg refuseTask(@RequestBody Mesg mesg){
        taskMapper.refuseFirm(mesg);
        return new Mesg("1");
    }
}
