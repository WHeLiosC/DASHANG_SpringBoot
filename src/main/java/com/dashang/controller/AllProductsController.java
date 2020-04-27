package com.dashang.controller;

import com.dashang.entity.Page;
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
public class AllProductsController {

    @Autowired
    ProductMapper productMapper;

    @RequestMapping(value = "/getAll" , method = RequestMethod.POST)
    public List<Product> getAll(@RequestBody Page page){
        int num = page.getPageNum();
        int size = page.getPageSize();

        List<Product> list = productMapper.getAll();
        if((num-1)*size<list.size())
            return list.subList((num-1)*size,Math.min(num*size,list.size()));
        else
            return null;
    }
}
