package com.ds.demo.Message;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Mesg {
    private String message;
    private int numMesg;

    public Mesg() {
    }

    public Mesg(String message){
        this.message = message;
    }

    @JsonProperty(value = "numMesg")
    public int getNumMesg() {
        return numMesg;
    }

    @JsonProperty(value = "numMesg")
    public void setNumMesg(int numMesg) {
        this.numMesg = numMesg;
    }

    @JsonProperty(value = "message")
    public String getMessage() {
        return message;
    }

    @JsonProperty(value = "message")
    public void setMessage(String message) {
        this.message = message;
    }
}
