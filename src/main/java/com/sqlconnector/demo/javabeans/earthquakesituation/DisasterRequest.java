package com.sqlconnector.demo.javabeans.earthquakesituation;

import com.sqlconnector.demo.javabeans.Object;

/**
 * 震情数据库设计表
 * DisasterRequest：输出灾情数据信息表
 */
public class DisasterRequest extends Object {
    public DisasterRequest() {
    }

    private String id;
    private String date;
    private String disasterType;
    private String staus;
    private String o_URL;
    private String requestUnit;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDisasterType() {
        return disasterType;
    }

    public void setDisasterType(String disasterType) {
        this.disasterType = disasterType;
    }

    public String getStaus() {
        return staus;
    }

    public void setStaus(String staus) {
        this.staus = staus;
    }

    public String getO_URL() {
        return o_URL;
    }

    public void setO_URL(String o_URL) {
        this.o_URL = o_URL;
    }

    public String getRequestUnit() {
        return requestUnit;
    }

    public void setRequestUnit(String requestUnit) {
        this.requestUnit = requestUnit;
    }
}
