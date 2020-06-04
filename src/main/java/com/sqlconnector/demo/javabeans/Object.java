package com.sqlconnector.demo.javabeans;

import com.alibaba.fastjson.JSONObject;

public class Object {
    private String reportingUnit;
    public Object(){
        reportingUnit=null;
    }

    public void setReportingUnit(String reportingUnit){
        this.reportingUnit=reportingUnit;
    }

    public String getReportingUnit(){
        return this.reportingUnit;
    }

    public void add(JSONObject object){

    }
}
