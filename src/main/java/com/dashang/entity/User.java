package com.dashang.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    private int userId;
    private int userType;

    @JsonProperty(value = "userId")
    public int getUserId() {
        return userId;
    }

    @JsonProperty(value = "userId")
    public void setUserId(int userId) {
        this.userId = userId;
    }

    @JsonProperty(value = "userType")
    public int getUserType() {
        return userType;
    }

    @JsonProperty(value = "userType")
    public void setUserType(int userType) {
        this.userType = userType;
    }
}