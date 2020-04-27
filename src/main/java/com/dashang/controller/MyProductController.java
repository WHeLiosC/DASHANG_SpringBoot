package com.dashang.controller;


import com.dashang.entity.Product;
import com.dashang.entity.User;
import com.dashang.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyProductController {
    @Autowired
    ProductMapper productMapper;

    @RequestMapping(value = "/getMy",method = RequestMethod.POST)
    public List<Product> getMyProducts(@RequestBody User user){
        return productMapper.getMy(user);
    }

}
