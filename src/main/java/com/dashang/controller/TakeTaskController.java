package com.dashang.controller;

import com.dashang.Message.Mesg;
import com.dashang.entity.TakeTask;
import com.dashang.mapper.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TakeTaskController {
    @Autowired
    TaskMapper taskMapper;

    @RequestMapping(value = "/takeTask",method = RequestMethod.POST)
    public Mesg takeTask(@RequestBody TakeTask takeTask){
        if(!taskMapper.getThis0(takeTask).isEmpty()){
            taskMapper.setFirm(takeTask);
            return new Mesg("1");
        }
        else{
            return new Mesg("0");
        }
    }

}
