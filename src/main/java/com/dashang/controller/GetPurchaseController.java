package com.ds.demo.controller;

import com.ds.demo.Message.Mesg;
import com.ds.demo.entity.FirmProducts;
import com.ds.demo.entity.Order;
import com.ds.demo.entity.Purchase;
import com.ds.demo.mapper.PurchaseMapper;
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