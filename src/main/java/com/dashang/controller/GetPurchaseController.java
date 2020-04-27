package com.dashang.controller;

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
    public List<Purchase> getPurchase(){
        return purchaseMapper.getAll();
    }
}