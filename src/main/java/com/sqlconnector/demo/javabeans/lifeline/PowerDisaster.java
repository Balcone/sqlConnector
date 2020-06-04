package com.sqlconnector.demo.javabeans.lifeline;

import com.alibaba.fastjson.JSONObject;
import com.sqlconnector.demo.javabeans.Object;

/**
 * 生命线数据库设计表
 * PowerDisaster：电力系统灾情统计表
 */
public class PowerDisaster extends Object {
    public PowerDisaster() {
    }

    private String id;
    private String date;
    private String location;
    private String type;
    private String grade;
    private String picture;
    private String note;
    private String reportingUnit;

    public void add(JSONObject jsonObject){
        this.setId(jsonObject.getString("Code"));
        this.setDate(jsonObject.getString("Date"));
        this.setLocation(jsonObject.getString("Location"));
        this.setType(jsonObject.getString("Type"));
        this.setGrade(jsonObject.getString("Grade"));
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getReportingUnit() {
        return reportingUnit;
    }

    public void setReportingUnit(String reportingUnit) {
        this.reportingUnit = reportingUnit;
    }
}
