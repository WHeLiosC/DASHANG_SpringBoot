package com.dashang.entity;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Task {
    private int taskId;
    private int taskState;
    private int productId;
    private int nums;
    private int price;
    private int userId;
    private String productName;

    @JsonProperty(value = "PRODUCT_NAME")
    public String getProductName() {
        return productName;
    }

    @JsonProperty(value = "PRODUCT_NAME")
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Task(int TASK_ID, int TASK_STATE, int PRODUCT_ID, int NUMS, int PRICE, int USER_ID) {
        this.taskId = TASK_ID;
        this.taskState = TASK_STATE;
        this.productId = PRODUCT_ID;
        this.nums = NUMS;
        this.price = PRICE;
        this.userId = USER_ID;
    }

    public Task() {
    }

    @JsonProperty(value = "TASK_ID")
    public int getTaskId() {
        return taskId;
    }

    @JsonProperty(value = "TASK_ID")
    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    @JsonProperty(value = "TASK_STATE")
    public int getTASK_STATE() {
        return taskState;
    }

    @JsonProperty(value = "TASK_STATE")
    public void setTASK_STATE(int TASK_STATE) {
        this.taskState = TASK_STATE;
    }

    @JsonProperty(value = "PRODUCT_ID")
    public int getPRODUCT_ID() {
        return productId;
    }

    @JsonProperty(value = "PRODUCT_ID")
    public void setPRODUCT_ID(int PRODUCT_ID) {
        this.productId = PRODUCT_ID;
    }

    @JsonProperty(value = "NUMS")
    public int getNUMS() {
        return nums;
    }

    @JsonProperty(value = "NUMS")
    public void setNUMS(int NUMS) {
        this.nums = NUMS;
    }

    @JsonProperty(value = "PRICE")
    public int getPRICE() {
        return price;
    }

    @JsonProperty(value = "PRICE")
    public void setPRICE(int PRICE) {
        this.price = PRICE;
    }

    @JsonProperty(value = "USER_ID")
    public int getUSER_ID() {
        return userId;
    }

    @JsonProperty(value = "USER_ID")
    public void setUSER_ID(int USER_ID) {
        this.userId = USER_ID;
    }
}
