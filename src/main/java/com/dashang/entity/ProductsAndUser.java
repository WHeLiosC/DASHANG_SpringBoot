package com.ds.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductsAndUser {

    @JsonProperty(value = "PRODUCT_ID")
    public int getPRODUCT_ID() {
        return productId;
    }

    @JsonProperty(value = "PRODUCT_ID")
    public void setPRODUCT_ID(int PRODUCT_ID) {
        this.productId = PRODUCT_ID;
    }

    @JsonProperty(value = "PRODUCT_NAME")
    public String getPRODUCT_NAME() {
        return productName;
    }

    @JsonProperty(value = "PRODUCT_NAME")
    public void setPRODUCT_NAME(String PRODUCT_NAME) {
        this.productName = PRODUCT_NAME;
    }

    @JsonProperty(value = "PRODUCT_BRAND")
    public String getPRODUCT_BRAND() {
        return productBrand;
    }

    @JsonProperty(value = "PRODUCT_BRAND")
    public void setPRODUCT_BRAND(String PRODUCT_BRAND) {
        this.productBrand = PRODUCT_BRAND;
    }

    @JsonProperty(value = "PRICE")
    public int getPRICE() {
        return price;
    }

    @JsonProperty(value = "PRICE")
    public void setPRICE(int PRICE) {
        this.price = PRICE;
    }

    @JsonProperty(value = "DESCRIPTION")
    public String getDESCRIPTION() {
        return description;
    }

    @JsonProperty(value = "DESCRIPTION")
    public void setDESCRIPTION(String DESCRIPTION) {
        this.description = DESCRIPTION;
    }

    @JsonProperty(value = "PIC")
    public String getPIC() {
        return pic;
    }

    @JsonProperty(value = "PIC")
    public void setPIC(String PIC) {
        this.pic = PIC;
    }

    @JsonProperty(value = "USER_ID")
    public int getUSER_ID() {
        return userId;
    }

    @JsonProperty(value = "USER_ID")
    public void setUSER_ID(int USER_ID) {
        this.userId = USER_ID;
    }

    @JsonProperty(value = "USER_TYPE")
    public int getUSER_TYPE() {
        return userType;
    }

    @JsonProperty(value = "USER_TYPE")
    public void setUSER_TYPE(int USER_TYPE) {
        this.userType = USER_TYPE;
    }

    private int productId;
    private String productName;
    private String productBrand;
    private int price; //这个在所有商品展示时是物业标价，在本厂商品展示时是本厂报价
    private String description;
    private String pic;

    private int userId;
    private int userType;
}
