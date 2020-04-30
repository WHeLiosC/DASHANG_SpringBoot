package com.dashang.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class orderDomain {
    private int userId;
    private  int orderId;
    private int productId;
    private int nums;
    private int receipt;

    @JsonProperty(value = "USER_ID")
    public int getUserId() {
        return userId;
    }
    @JsonProperty(value = "USER_ID")
    public void setUserId(int userId) {
        this.userId = userId;
    }
    @JsonProperty(value = "ORDER_ID")
    public int getOrderId() {
        return orderId;
    }
    @JsonProperty(value = "ORDER_ID")
    public void setOrderIdId(int orderId) {
        this.orderId = orderId;
    }
    @JsonProperty(value = "PRODUCT_ID")
    public int getProductIdId() {
        return productId;
    }
    @JsonProperty(value = "PRODUCT_ID")
    public void setProductId(int productId) {
        this.productId = productId;
    }
    @JsonProperty(value = "NUMS")
    public int getNums(){return nums;}
    @JsonProperty(value = "NUMS")
    public void setNums(int nums) { this.nums=nums; }
    @JsonProperty(value = "RECEIPT")
    public int getReceipt() { return receipt; }
    @JsonProperty(value = "RECEIPT")
    public void setReceipt(int receipt){ this.receipt=receipt; }
    @Override
    public String toString() {
        return "orderDomain{" +
                "userId=" + userId +
                ", orderId'" + orderId + '\'' +
                ", productId'" + productId + '\'' +
                ", nums='" + nums + '\'' +
                ", Receipt='" + receipt + '\'' +
                '}';
    }
}
