package com.sqlconnector.demo;

import com.sqlconnector.demo.readinjson.Data;
import com.sqlconnector.demo.readinjson.ReadInJson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.ArrayList;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(DemoApplication.class, args);
    }



}
