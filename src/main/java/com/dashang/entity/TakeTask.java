package com.dashang.entity;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TakeTask {
    private int taskId;
    private int userId;
    private int price;

    @JsonProperty(value = "PRICE")
    public int getPRICE() {
        return price;
    }

    @JsonProperty(value = "PRICE")
    public void setPRICE(int PRICE) {
        this.price = PRICE;
    }

    @JsonProperty(value = "TASK_ID")
    public int getTASK_ID() {
        return taskId;
    }

    @JsonProperty(value = "TASK_ID")
    public void setTASK_ID(int TASK_ID) {
        this.taskId = TASK_ID;
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
