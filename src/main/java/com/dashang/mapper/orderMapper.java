package com.dashang.mapper;

import com.dashang.model.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.core.annotation.Order;
import com.dashang.entity.Product;

import java.util.List;

@Mapper
public interface orderMapper {
   //订单相关，写在xml里面了
   @Insert("insert into orders (PRODUCT_ID,USER_ID,NUMS,RECEIPT) values (#{productId},#{userId},#{nums},#{receipt});")
   void submitOrder(int productId,int userId,int nums,boolean receipt);
   @Select("select * from orders inner join product on orders.PRODUCT_ID=product.PRODUCT_ID")
   List<orderFull>  getAllOrders();
   @Select("select * from orders inner join product on orders.PRODUCT_ID=product.PRODUCT_ID where USER_ID=#{userId} ")
   List<orderFull> getOrder(int userId);
   @Insert("insert into purchase (PRODUCT_ID,NUMS) values (#{productId},#{nums})")
   void orderToPurchaseInsert(int productId,int nums);
   @Update("UPDATE purchase SET NUMS=#{nums} where PRODUCT_ID=#{productId}")
   void orderToPurchase(int productId,int nums);
   @Select("select NUMS from purchase where PRODUCT_ID=#{productId}")
   int[] getProductNums(int productId);
   @Update("UPDATE orders SET RECEIPT=1 where ORDER_ID=#{orderId}")
   void Receipt(int orderId);
   //商品相关
   @Select("select * from product")
   List<Product> getAllProducts();
   @Select("select * from product where PRODUCT_Name =#{productName}")
   List<Product> getProductByName(String productName);
   @Select("select * from product where PRODUCT_BRAND =#{productBrand}")
   List<Product> getProductsByBrand(String productBrand);

   //品牌相关
   @Select("select * from brand")
   List<Brand> getAllBrands();

   //获取列表最大
   @Select("select count(*) from #{listName}")
   int getNum(String listName);

}
