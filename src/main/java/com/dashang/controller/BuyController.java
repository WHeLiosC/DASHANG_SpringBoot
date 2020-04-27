package com.ds.demo.controller;

import com.ds.demo.Message.Mesg;
import com.ds.demo.entity.*;
import com.ds.demo.mapper.PurchaseMapper;
import com.ds.demo.mapper.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//采购，将采购转化为任务
@RestController
public class BuyController {
    @Autowired
    TaskMapper taskMapper;
    @Autowired
    PurchaseMapper purchaseMapper;

    @RequestMapping(value = "/buy" , method = RequestMethod.POST)
    public Mesg buy(@RequestBody Purchase purchase){
        if(!purchaseMapper.getThis(purchase).isEmpty()){
            purchaseMapper.delPurchase(purchase);
            Task task = new Task(0,0,purchase.getPRODUCT_ID(),purchase.getNUMS(),0,0);
            taskMapper.add(task);
            return new Mesg("1");
        }
        else{
            return new Mesg("0");
        }
    }
}
