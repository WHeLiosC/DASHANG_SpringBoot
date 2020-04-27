package com.ds.demo.mapper;

import com.ds.demo.Message.Mesg;
import com.ds.demo.entity.*;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface PurchaseMapper {
    //搜索所有采购
    @Select("select * from purchase")
    List<Purchase> getAll();

    //从厂商商品列表中删除（商品，厂商）记录
    @Delete("delete from purchase where PURCHASE_ID = #{purchaseId}")
    void delPurchase(Purchase purchase);

    @Select("select * from purchase where PURCHASE_ID = #{purchaseId}")
    List<Purchase> getThis(Purchase purchase);
}
