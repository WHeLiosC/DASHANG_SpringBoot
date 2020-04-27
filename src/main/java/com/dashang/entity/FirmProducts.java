package com.dashang.entity;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FirmProducts {
    private int productId;
    private int userId;
    private int price;

    public FirmProducts(int PRODUCT_ID, int USER_ID, int PRICE) {
        this.productId = PRODUCT_ID;
        this.userId = USER_ID;
        this.price = PRICE;
    }

    public FirmProducts() {
    }

    @JsonProperty(value = "PRODUCT_ID")
    public int getPRODUCT_ID() {
        return productId;
    }

    @JsonProperty(value = "PRODUCT_ID")
    public void setPRODUCT_ID(int PRODUCT_ID) {
        this.productId = PRODUCT_ID;
    }

    @JsonProperty(value = "USER_ID")
    public int getUSER_ID() {
        return userId;
    }

    @JsonProperty(value = "USER_ID")
    public void setUSER_ID(int USER_ID) {
        this.userId = USER_ID;
    }

    @JsonProperty(value = "PRICE")
    public int getPRICE() {
        return price;
    }

    @JsonProperty(value = "PRICE")
    public void setPRICE(int PRICE) {
        this.price = PRICE;
    }

    @Override
    public String toString() {
        return "FirmProducts{" +
                "PRODUCT_ID=" + productId +
                ", USER_ID=" + userId +
                ", PRICE=" + price +
                '}';
    }
}