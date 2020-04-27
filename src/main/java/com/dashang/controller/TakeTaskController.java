package com.ds.demo.controller;

import com.ds.demo.Message.Mesg;
import com.ds.demo.entity.TakeTask;
import com.ds.demo.mapper.TaskMapper;
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
