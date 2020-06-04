package com.sqlconnector.demo.controller;

import com.sqlconnector.demo.common.CommonResult;
import com.sqlconnector.demo.domain.Commdisaster;
import com.sqlconnector.demo.service.CommDisasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommDisasterController {
    @Autowired
    private CommDisasterService commDisasterService;

    //查询所有
    @GetMapping(value = "/findAll")
    public CommonResult findAll() {
        CommonResult result = new CommonResult();
        try {
            List<Commdisaster> list = commDisasterService.findAll();
            //将查询结果封装到CommonResult中
            result.setData(list);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result.setState(500);
            result.setMsg("失败");
            return result;
        }
    }
}
