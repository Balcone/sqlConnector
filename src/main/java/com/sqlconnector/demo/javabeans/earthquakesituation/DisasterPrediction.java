package com.sqlconnector.demo.javabeans.earthquakesituation;

import com.alibaba.fastjson.JSONObject;
import com.sqlconnector.demo.javabeans.Object;

/**
 * 震情数据库设计表
 * DisasterPrediction：灾情预测
 */
public class DisasterPrediction extends Object {
    public DisasterPrediction() {
    }

    private String id;
    private String date;
    private String location;
    private String longitude;
    private String latitude;
    private String depth;
    private String magnitude;
    private String intensity;
    private String type;
    private String picture;
    private String note;
    private String reportingUnit;

    public void add(JSONObject jsonObject){
        this.setId(jsonObject.getString("Code"));
        this.setLocation(jsonObject.getString("Location"));
        this.setDate(jsonObject.getString("Date"));
        this.setLongitude(jsonObject.getString("Longitude"));
        this.setLatitude(jsonObject.getString("Latitude"));
        this.setDepth(jsonObject.getString("Depth"));
        this.setMagnitude(jsonObject.getString("Magnitude"));
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

    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    /**
     * 震情数据库设计表
     * DisasterRequ：请求灾情数据
     */
    public static class DisasterRequest {
        public DisasterRequest() {
        }

        private String id;
        private String date;
        private String disasterType;
        private String status;
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

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
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
}
