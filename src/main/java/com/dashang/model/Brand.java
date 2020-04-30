package com.dashang.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Brand {
    private int BrandId;
    private String BrandName;
    private String BrandPicture;
    private String BrandIntroduction;


    @JsonProperty(value = "BRAND_ID")
    public int getBrandId() { return BrandId; }
    @JsonProperty(value = "BRAND_ID")
    public void setBrandId(int BrandId) {this.BrandId = BrandId; }
    @JsonProperty(value = "BRAND_NAME")
    public String getBrandName() {
        return BrandName;
    }
    @JsonProperty(value = "BRAND_NAME")
    public void setBrandName(String BrandName) {this.BrandName = BrandName; }
    @JsonProperty(value = "BRAND_PICTURE")
    public String getBrandPicture() { return BrandPicture; }
    @JsonProperty(value = "BRAND_PICTURE")
    public void setBrandPicture(String BrandPicture) {
        this.BrandPicture = BrandPicture;
    }
    @JsonProperty(value = "BRAND_INTRODUCTION")
    public String getBrandIntroduction(){return BrandIntroduction; }
    @JsonProperty(value = "BRAND_INTRODUCTION")
    public void setBrandIntroduction(String BrandIntroduction) {
        this.BrandIntroduction = BrandIntroduction;
    }



    @Override
    public String toString() {
        return "Brand{" +
                "BrandName=" + BrandName +
                ", BrandIntroduction'" + BrandIntroduction + '\'' +
                ", BrandPicture'" + BrandPicture +'\''+
                ", BrandId='" + BrandId + '\'' +
                '}';
    }

}
