package com.dashang.service;

import com.dashang.mapper.orderMapper;
import com.dashang.model.Brand;
import com.dashang.model.Product;
import com.dashang.model.orderDomain;
import com.dashang.model.orderFull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class orderService {
    @Autowired
    private orderMapper orderMapper;
    //订单到任务
    private void orderToPurchase(int num,int productId){
        int a[];
        a=orderMapper.getProductNums(productId);
        if (a.length!=0){
//            System.out.print('\n');
//            System.out.print(a);
            int nums=a[0]+num;
            orderMapper.orderToPurchase(productId,nums);
        }
        else{
            orderMapper.orderToPurchaseInsert(productId,num);
        }

    }
    //订单相关
    public List<orderFull> getOrder(int userId,int page,int size){
        int n=orderMapper.getOrder(userId).size();
        if((n-1)>=page*size){
            return orderMapper.getOrder(userId).subList((page-1)*size, page*size);
        }
        return orderMapper.getOrder(userId).subList((page-1)*size, n);
    }

    public void submitOrder(int productId,int userId,int nums){
        orderToPurchase(nums,productId);
        boolean receipt=false;
        orderMapper.submitOrder(productId,userId,nums,false);
    }
    public void Receipt(int orderId){ orderMapper.Receipt(orderId); }


    // 商品列表相关
    public List<Product> getAllProducts(int size,int page){
        int n=orderMapper.getAllProducts().size();
        if((n-1)>=page*size){
            return  orderMapper.getAllProducts().subList((page-1)*size, page*size);
        }
        return orderMapper.getAllProducts().subList((page-1)*size, n);
    }

    public List<Product> getProductByName(String productName,int size,int page){
        int n=orderMapper.getProductByName(productName).size();
        if((n-1)>=page*size){
            return  orderMapper.getProductByName(productName).subList((page-1)*size, page*size);
        }
        return  orderMapper.getProductByName(productName).subList((page-1)*size, n);}

    public List<Product> getProductsByBrand(String productBrand,int size,int page){
        int n=orderMapper.getProductsByBrand(productBrand).size();
        if((n-1)>=page*size){
            return  orderMapper.getProductsByBrand(productBrand).subList((page-1)*size, page*size);
        }
        return  orderMapper.getProductsByBrand(productBrand).subList((page-1)*size, n);}
    //品牌列表相关
    public List<Brand> getAllBrands(int size,int page){
        int n=orderMapper.getAllBrands().size();
        if((n-1)>=page*size){
            return  orderMapper.getAllBrands().subList((page-1)*size, page*size);
        }
        return  orderMapper.getAllBrands().subList((page-1)*size, n);
    }

    //获得列表最大
    public int getNum(String listName){
        return orderMapper.getNum(listName);
    }

}
