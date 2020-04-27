package com.ds.demo.entity;

public class Order {
    private int orderId;
    private int productId;
    private int userId;
    private int nums;

    public int getORDER_ID() {
        return orderId;
    }

    public void setORDER_ID(int ORDER_ID) {
        this.orderId = ORDER_ID;
    }

    public int getPRODUCT_ID() {
        return productId;
    }

    public void setPRODUCT_ID(int PRODUCT_ID) {
        this.productId = PRODUCT_ID;
    }

    public int getUSER_ID() {
        return userId;
    }

    public void setUSER_ID(int USER_ID) {
        this.userId = USER_ID;
    }

    public int getNUMS() {
        return nums;
    }

    public void setNUMS(int NUMS) {
        this.nums = NUMS;
    }
}
