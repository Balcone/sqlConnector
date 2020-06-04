package com.sqlconnector.demo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.lang.String;
import java.sql.Blob;

@Entity
public class Information {
    @Id
    private char ID;
    private char data;
    private char location;
    private char type;
    private char grade;
    private Blob picture;
    private char note;
    private char reporting_unit;

    public Information() {
    }

    public Information(char ID, char data, char location, char type, char grade, Blob picture, char note, char reporting_unit) {
        this.ID = ID;
        this.data = data;
        this.location = location;
        this.type = type;
        this.grade = grade;
        this.picture = picture;
        this.note = note;
        this.reporting_unit = reporting_unit;
    }

    public char getID() {
        return ID;
    }

    public void setID(char ID) {
        this.ID = ID;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public char getLocation() {
        return location;
    }

    public void setLocation(char location) {
        this.location = location;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public Blob getPicture() {
        return picture;
    }

    public void setPicture(Blob picture) {
        this.picture = picture;
    }

    public char getNote() {
        return note;
    }

    public void setNote(char note) {
        this.note = note;
    }

    public char getReporting_unit() {
        return reporting_unit;
    }

    public void setReporting_unit(char reporting_unit) {
        this.reporting_unit = reporting_unit;
    }
}
