package com.sqlconnector.demo.controller;

import com.sqlconnector.demo.readinjson.Data;
import com.sqlconnector.demo.readinjson.ReadInJson;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.ArrayList;


/**
 * 文件上传
 */
@RestController
public class fileUploadController {
    /**
     * 文件上传
     */
    @PostMapping("/202/CommDisaster")
    public String fileUpload(MultipartFile file) throws Exception{
        String path="src/main/resources/data";
        System.out.println(file.getOriginalFilename());
        file.transferTo(new File(path+file.getOriginalFilename()));

        ArrayList<Data> datas=new ArrayList<>();
        new ReadInJson().getFiles(path, datas);

        return "OK";
    }
}
