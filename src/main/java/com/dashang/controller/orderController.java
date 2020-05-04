package com.dashang.controller;

import com.dashang.entity.Product;
import com.dashang.model.Brand;

import com.dashang.model.orderFull;
import com.dashang.service.orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class orderController {
    @Autowired
    private orderService orderService;

    //订单相关
    @RequestMapping("/showAllOrder")
    public List<orderFull> showAllOrder(){ return orderService.getAllOrders(); }

    @GetMapping("/showUserOrder")
    public List<orderFull> showUserOrder( int userId,int page,int size){ return orderService.getOrder(userId,page,size); }

    @GetMapping(value="/submitUserOrder")
    public void submitUserOrder( int productId, int userId,int nums){
        orderService.submitOrder(productId,userId,nums);
    }
    @RequestMapping("/Receipt")
    public void Receipt(int orderId){ orderService.Receipt(orderId); }

    //商品相关
    @GetMapping("/showAllProducts")
    public List<Product> showAllProducts(int size, int page){ return orderService.getAllProducts(size,page); }

    //用品牌查询商品
    @GetMapping("/showProductByBrand")
    public List<Product> showProductsByBrand(String productBrand,int size,int page){ return orderService.getProductsByBrand(productBrand,size,page); }


    //用名称查询商品
    @GetMapping("/showProductByName")
    public List<Product> showProductByName(String productName,int size,int page){ return orderService.getProductByName(productName,size,page); }

    //品牌相关
    //查询所有品牌
    @GetMapping("/showAllBrands")
    public List<Brand> showAllBrand(int size,int page){ return orderService.getAllBrands(size,page); }

    //列表总数查询
    @GetMapping("/getUserOrderTotal")
    public int getUserOrderTotal(int userId){
        return orderService.getUserOrderTotal(userId);
    }
    @GetMapping("/getBrandProductTotal")
    public int getBrandProductTotal(int brandId){return orderService.getBrandProductTotal(brandId);}
}
// @RequestMapping如果没有指定请求方式，将接收Get,Post,Head,Options等所有的请求方式
// @GetMapping是一个组合注解，是@RequestMapping(method = RequestMethod.GET)的缩写。 
// @PostMapping是一个组合注解，是@RequestMapping(method = RequestMethod.POST)的缩写。



//    //用商品id查询商品
//    @GetMapping("/showProduct/{productBrand}")
//    public orderDomain showProduct(@PathVariable(value="productBrand") String productBrand){ return orderService.getProduct(productBrand); }
//    public List<Product> shoAllProducts(){ return orderService.getAllProducts(); }
