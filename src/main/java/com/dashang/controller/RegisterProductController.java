package com.dashang.controller;

import com.dashang.Message.Mesg;
import com.dashang.entity.FirmProducts;
import com.dashang.entity.Product;
import com.dashang.entity.ProductsAndUser;
import com.dashang.mapper.ProductMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterProductController {
    @Autowired
    ProductMapper productMapper;

    @RequestMapping(value = "/registerProduct", method = RequestMethod.POST)
    public Mesg addProduct(@RequestBody ProductsAndUser productsAndUser){
        System.out.println(productsAndUser.toString());
        Product product = new Product(productsAndUser.getPRODUCT_ID(),productsAndUser.getPRODUCT_NAME(),productsAndUser.getPRODUCT_BRAND(),productsAndUser.getPRICE(),productsAndUser.getDESCRIPTION(),productsAndUser.getPIC());
        if(productMapper.selectThisProducts(product).isEmpty()){
            productMapper.add(product);
            FirmProducts firmProducts = new FirmProducts(product.getPRODUCT_ID(),productsAndUser.getUSER_ID(),productsAndUser.getPRICE());
            productMapper.addToMy(firmProducts);
            return new Mesg("" + product.getPRODUCT_ID());
        }
        else {
            return new Mesg("0");
        }
    }


}
