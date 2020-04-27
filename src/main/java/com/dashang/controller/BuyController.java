package com.dashang.controller;

import com.dashang.Message.Mesg;
import com.dashang.entity.Purchase;
import com.dashang.entity.Task;
import com.dashang.mapper.PurchaseMapper;
import com.dashang.mapper.TaskMapper;
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
