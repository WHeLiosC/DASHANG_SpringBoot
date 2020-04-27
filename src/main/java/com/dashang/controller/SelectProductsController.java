package com.dashang.controller;

import com.dashang.Message.Mesg;
import com.dashang.entity.Product;
import com.dashang.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SelectProductsController {
    @Autowired
    ProductMapper productMapper;

    @RequestMapping(value = "/selectProducts",method = RequestMethod.POST)
    public List<Product> selectProducts(@RequestBody Mesg mesg){
        System.out.println(mesg.getMessage());
        return productMapper.selectProducts(mesg);
    }
}
