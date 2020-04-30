package com.dashang.controller;

import com.dashang.Message.Mesg;
import com.dashang.mapper.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
