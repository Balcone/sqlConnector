package com.sqlconnector.demo.readinjson;

import com.sqlconnector.demo.javabeans.Object;

public class Data {
    private Object javaBean;
    private String type;

    public Data() {
    }

    public Data(Object javaBean, String type){
        this.javaBean=javaBean;
        this.type=type;
    }

    public Object getJavaBean() {
        return javaBean;
    }

    public void setJavaBean(Object javaBean) {
        this.javaBean = javaBean;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
