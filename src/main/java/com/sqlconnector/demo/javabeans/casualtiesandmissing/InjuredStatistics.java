package com.sqlconnector.demo.javabeans.casualtiesandmissing;

import com.alibaba.fastjson.JSONObject;
import com.sqlconnector.demo.javabeans.Object;

import java.io.File;

/**
 * 人员伤亡及失踪数据库设计表
 * InjuStatistics：人员受伤统计表
 */
public class InjuredStatistics extends Object {
    public InjuredStatistics() {
    }

    private String id;
    private String location;
    private String date;
    private int number;
    private String reportingUnit;

    public void add(JSONObject jsonObject){
        this.setId(jsonObject.getString("Code"));
        this.setLocation(jsonObject.getString("Location"));
        this.setDate(jsonObject.getString("Date"));
        this.setNumber(jsonObject.getInteger("Number"));
        this.setReportingUnit(jsonObject.getString("ReportingUnit"));
    }

    public static void add(File file, java.lang.Object object){


    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getReportingUnit() {
        return reportingUnit;
    }

    public void setReportingUnit(String reportingUnit) {
        this.reportingUnit = reportingUnit;
    }
}
