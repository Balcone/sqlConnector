package com.sqlconnector.demo.javabeans.housedamage;

import com.alibaba.fastjson.JSONObject;
import com.sqlconnector.demo.javabeans.Object;

/**
 * 房屋破坏数据库设计表
 * OtherStructure：其他结构房屋破坏统计表
 */
public class OtherStructure extends Object {
    public OtherStructure() {
    }

    private String id;
    private String date;
    private String location;
    private String basicallyIntactSquare;
    private String slightDamagedSquare;
    private String moderateDamagedSquare;
    private String seriousDamagedSquare;
    private String destroyedSquare;
    private String note;
    private String reportingUnit;

    public void add(JSONObject jsonObject){
        this.setId(jsonObject.getString("Code"));
        this.setLocation(jsonObject.getString("Location"));
        this.setDate(jsonObject.getString("Date"));
        this.setBasicallyIntactSquare(jsonObject.getString("BasicallyIntctSquare"));
        this.setSlightDamagedSquare(jsonObject.getString("SlightDamagedSquare"));
        this.setModerateDamagedSquare(jsonObject.getString("ModerateDamagedSquare"));
        this.setSeriousDamagedSquare(jsonObject.getString("SeriousDamagedSquare"));
        this.setDestroyedSquare(jsonObject.getString("DestroyedSquare"));
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

    public String getBasicallyIntactSquare() {
        return basicallyIntactSquare;
    }

    public void setBasicallyIntactSquare(String basicallyIntactSquare) {
        this.basicallyIntactSquare = basicallyIntactSquare;
    }

    public String getSlightDamagedSquare() {
        return slightDamagedSquare;
    }

    public void setSlightDamagedSquare(String slightDamagedSquare) {
        this.slightDamagedSquare = slightDamagedSquare;
    }

    public String getModerateDamagedSquare() {
        return moderateDamagedSquare;
    }

    public void setModerateDamagedSquare(String moderateDamagedSquare) {
        this.moderateDamagedSquare = moderateDamagedSquare;
    }

    public String getSeriousDamagedSquare() {
        return seriousDamagedSquare;
    }

    public void setSeriousDamagedSquare(String seriousDamagedSquare) {
        this.seriousDamagedSquare = seriousDamagedSquare;
    }

    public String getDestroyedSquare() {
        return destroyedSquare;
    }

    public void setDestroyedSquare(String destroyedSquare) {
        this.destroyedSquare = destroyedSquare;
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
