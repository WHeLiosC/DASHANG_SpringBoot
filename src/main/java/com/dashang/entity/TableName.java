package com.dashang.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TableName {
    private String name;

    @JsonProperty(value = "name")
    public String getTableName() {
        return name;
    }

    @JsonProperty(value = "name")
    public void setTableName(String tableName) {
        this.name = tableName;
    }
}
