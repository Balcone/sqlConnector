package com.sqlconnector.demo.javabeans.secondarydisaster;

import com.alibaba.fastjson.JSONObject;
import com.sqlconnector.demo.javabeans.Object;

/**
 * 次生灾害数据库设计表
 * LandslideRecord：滑坡记录表
 */
public class LandslideRecord extends Object {
    public LandslideRecord() {
    }

    private String id;
    private String location;
    private String date;
    private String type;
    private String status;
    private String note;
    private String picture;
    private String reportingUnit;

    public void add(JSONObject jsonObject){
        this.setId(jsonObject.getString("Code"));
        this.setDate(jsonObject.getString("Date"));
        this.setLocation(jsonObject.getString("Location"));
        this.setType(jsonObject.getString("Type"));
        this.setStatus(jsonObject.getString("Status"));
        this.setPicture(jsonObject.getString("Picture"));
        this.setNote(jsonObject.getString("Note"));
        this.setReportingUnit(jsonObject.getString("ReportingUnit"));
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getReportingUnit() {
        return reportingUnit;
    }

    public void setReportingUnit(String reportingUnit) {
        this.reportingUnit = reportingUnit;
    }

}
