package com.ds.demo.controller;

import com.ds.demo.Message.Mesg;
import com.ds.demo.entity.FirmProducts;
import com.ds.demo.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddToMyController {
    @Autowired
    ProductMapper productMapper;

    @RequestMapping(value = "/addToMy", method = RequestMethod.POST)
    public Mesg addToMy(@RequestBody FirmProducts firmProducts){
        System.out.println(firmProducts.toString());
        if(productMapper.getThisFirmProduct(firmProducts).isEmpty()){
            productMapper.addToMy(firmProducts);
            return new Mesg("1");
        }
        else{
            return new Mesg("0");
        }
    }
}
