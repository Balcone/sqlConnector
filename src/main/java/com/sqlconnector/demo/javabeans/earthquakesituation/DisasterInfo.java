package com.sqlconnector.demo.javabeans.earthquakesituation;

import com.alibaba.fastjson.JSONObject;
import com.sqlconnector.demo.javabeans.Object;

/**
 * 震情数据库设计表
 * DisasterInfo：基本震情
 */
public class DisasterInfo extends Object {
    public DisasterInfo() {
    }

    private String id;
    private String date;
    private String location;
    private String longitude;
    private String latitude;
    private String depth;
    private String magnitude;
    private String picture;
    private String reportingUnit;

    public void add(JSONObject jsonObject){
        this.setId(jsonObject.getString("Code"));
        this.setLocation(jsonObject.getString("Location"));
        this.setDate(jsonObject.getString("Date"));
        this.setLongitude(jsonObject.getString("Longitude"));
        this.setLatitude(jsonObject.getString("Latitude"));
        //this.setDepth(jsonObject.getFloat("Depth"));
        //this.setMagnitude(jsonObject.getFloat("Magnitude"));
        this.setPicture(jsonObject.getString("Picture"));
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

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(String magnitude) {
        this.magnitude = magnitude;
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
