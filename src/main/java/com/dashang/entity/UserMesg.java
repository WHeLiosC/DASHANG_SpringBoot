package com.dashang.entity;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserMesg {
    private int userId;
    private String userName;

    @JsonProperty(value = "USER_NAME")
    public String getUserName() {
        return userName;
    }

    @JsonProperty(value = "USER_NAME")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String cid;
    private String address;
    private String telNumber;
    private String email;
    private String pic;

    @JsonProperty(value = "USER_ID")
    public int getUSER_ID() {
        return userId;
    }

    @JsonProperty(value = "USER_ID")
    public void setUSER_ID(int USER_ID) {
        this.userId = USER_ID;
    }

    @JsonProperty(value = "CID")
    public String getCID() {
        return cid;
    }

    @JsonProperty(value = "CID")
    public void setCID(String CID) {
        this.cid = CID;
    }

    @JsonProperty(value = "ADDRESS")
    public String getADDRESS() {
        return address;
    }

    @JsonProperty(value = "ADDRESS")
    public void setADDRESS(String ADDRESS) {
        this.address = ADDRESS;
    }

    @JsonProperty(value = "TEL_NUMBER")
    public String getTEL_NUMBER() {
        return telNumber;
    }

    @JsonProperty(value = "TEL_NUMBER")
    public void setTEL_NUMBER(String TEL_NUMBER) {
        this.telNumber = TEL_NUMBER;
    }

    @JsonProperty(value = "EMAIL")
    public String getEMAIL() {
        return email;
    }

    @JsonProperty(value = "EMAIL")
    public void setEMAIL(String EMAIL) {
        this.email = EMAIL;
    }

    @JsonProperty(value = "PIC")
    public String getPIC() {
        return pic;
    }

    @JsonProperty(value = "PIC")
    public void setPIC(String PIC) {
        this.pic = PIC;
    }
}