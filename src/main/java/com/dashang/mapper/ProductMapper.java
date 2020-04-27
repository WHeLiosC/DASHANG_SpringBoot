package com.ds.demo.mapper;

import com.ds.demo.Message.Mesg;
import com.ds.demo.entity.*;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;
import java.util.List;



public interface ProductMapper {
    //向商品表插入 新 商品
    @Insert("insert into product values(null,#{productName},#{productBrand},#{price},#{description},#{pic})")
    @Options(useGeneratedKeys=true, keyProperty="productId", keyColumn="PRODUCT_ID")
    void add(Product product);

    //向 厂商商品表 插入（商品，厂商）记录
    @Insert("insert into firmProducts values(#{productId},#{userId},#{price})")
    void addToMy(FirmProducts firmProducts);

    //搜索所有商品
    @Select("select * from product")
    List<Product> getAll();

    //搜索本厂商所有商品
    @Select("select P1.PRODUCT_ID, P2.PRODUCT_NAME, P2.PRODUCT_BRAND, P1.PRICE, P2.DESCRIPTION, P2.PIC from (select * from firmProducts where USER_ID = #{userId}) as P1 join product as P2 on P1.PRODUCT_ID = P2.PRODUCT_ID")
    List<Product> getMy(User user);

    //搜索指定商品厂商关系
    @Select("select * from firmProducts where PRODUCT_ID = #{productId} and USER_ID = #{userId}")
    List<FirmProducts> getThisFirmProduct(FirmProducts firmProducts);

    //从厂商商品列表中删除（商品，厂商）记录
    @Delete("delete from firmProducts where PRODUCT_ID = #{productId} and USER_ID = #{userId}")
    void delFromMy(FirmProducts firmProducts);

    //根据关键字搜索符合条件的商品
    @Select("select * from product where PRODUCT_NAME like CONCAT('%',#{message},'%') or PRODUCT_BRAND like CONCAT('%',#{message},'%')")
    List<Product> selectProducts(Mesg mesg);

    //返回指定名称和商标的商品
    @Select("select * from product where PRODUCT_NAME = #{productName} and PRODUCT_BRAND = #{productBrand}")
    List<Product> selectThisProducts(Product product);

}
