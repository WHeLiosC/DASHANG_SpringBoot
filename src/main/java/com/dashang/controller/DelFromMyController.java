package com.dashang.controller;

import com.dashang.Message.Mesg;
import com.dashang.entity.FirmProducts;
import com.dashang.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DelFromMyController {
    @Autowired
    ProductMapper productMapper;

    @RequestMapping(value = "/delFromMy", method = RequestMethod.POST)
    public Mesg delFromMy(@RequestBody FirmProducts firmProducts){
        System.out.println(firmProducts.toString());
        if(productMapper.getThisFirmProduct(firmProducts).isEmpty()){
            return new Mesg("0");
        }
        else{
            productMapper.delFromMy(firmProducts);
            return new Mesg("1");
        }
    }
}

