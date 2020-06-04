package com.sqlconnector.demo.controller;

import com.sqlconnector.demo.common.CommonResult;
import com.sqlconnector.demo.domain.Information;
import com.sqlconnector.demo.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InfController {

    @Autowired
    private InformationService informationService;

    //添加
    @RequestMapping(value = "/addInformation")
    public CommonResult addStudent(Information information) {
        CommonResult result = new CommonResult();
        try {
            informationService.addInformation(information);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result.setState(500);
            result.setMsg("失败");
            return result;
        }
    }

    //修改
    @PutMapping(value = "/updateInformation")
    public CommonResult updateInformationById(Information information) {
        CommonResult result = new CommonResult();
        try {
            informationService.updateInformation(information);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result.setState(500);
            result.setMsg("失败");
            return result;
        }
    }

    //根据id删除一条数据
    @DeleteMapping(value = "/deleteInformation/{id}")
    public CommonResult deleteInformationById(@PathVariable(name = "id", required = true) char id) {
        CommonResult result = new CommonResult();
        try {
            informationService.deleteInformationById(id);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result.setState(500);
            result.setMsg("失败");
            return result;
        }
    }

    //查询所有
    @GetMapping(value = "/findAllInFor")
    public CommonResult findAll() {
        CommonResult result = new CommonResult();
        try {
            List<Information> list = informationService.findAll();
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

    //根据id查询一条数据
    @GetMapping(value = "/findInformationById/{id}")
    public CommonResult findInformationById(@PathVariable(name = "id") char id) {
        CommonResult result = new CommonResult();
        try {
//            Information information = informationService.findInformationById(id);
            //将查询结果封装到CommonResult中
//            result.setData(information);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            result.setState(500);
            result.setMsg("失败");
            return result;
        }
    }
}
