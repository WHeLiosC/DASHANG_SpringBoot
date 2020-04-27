package com.ds.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Page {
    private int pageNum;
    private int pageSize;

    @JsonProperty(value = "pageNum")
    public int getPageNum() {
        return pageNum;
    }

    @JsonProperty(value = "pageNum")
    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    @JsonProperty(value = "pageSize")
    public int getPageSize() {
        return pageSize;
    }

    @JsonProperty(value = "pageSize")
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
