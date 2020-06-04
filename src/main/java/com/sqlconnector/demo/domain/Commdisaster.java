package com.sqlconnector.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Commdisaster {

  @Id
  private String id;
  private String date;
  private String location;
  private String type;
  private String grade;
  private String picture;
  private String note;
  private String reportingUnit;


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
