package com.ds.demo.controller;

import com.ds.demo.Message.Mesg;
import com.ds.demo.entity.FirmProducts;
import com.ds.demo.entity.Order;
import com.ds.demo.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GetOrdersController {
    @Autowired
    OrderMapper orderMapper;

    @RequestMapping(value = "/getOrder", method = RequestMethod.POST)
    public List<Order> getOrder(){
        return orderMapper.getAll();
    }
}
