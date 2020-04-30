package com.dashang.controller;

import com.dashang.entity.Page;
import com.dashang.entity.Purchase;
import com.dashang.mapper.PurchaseMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GetPurchaseController {
    @Autowired
    PurchaseMapper purchaseMapper;

    @RequestMapping(value = "/getPurchase", method = RequestMethod.POST)
    public List<Purchase> getPurchase(@RequestBody Page page){
        int num = page.getPageNum();
        int size = page.getPageSize();
        List<Purchase> list = purchaseMapper.getAll();
        if((num-1)*size<list.size())
            return list.subList((num-1)*size,Math.min(num*size,list.size()));
        else
            return null;
    }
}