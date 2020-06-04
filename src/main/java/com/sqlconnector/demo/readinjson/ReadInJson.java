package com.sqlconnector.demo.readinjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sqlconnector.demo.javabeans.Object;
import com.sqlconnector.demo.javabeans.casualtiesandmissing.DeathStatistics;
import com.sqlconnector.demo.javabeans.casualtiesandmissing.InjuredStatistics;
import com.sqlconnector.demo.javabeans.casualtiesandmissing.MissingStatistics;
import com.sqlconnector.demo.javabeans.earthquakesituation.DisasterInfo;
import com.sqlconnector.demo.javabeans.earthquakesituation.DisasterPrediction;
import com.sqlconnector.demo.javabeans.housedamage.*;
import com.sqlconnector.demo.javabeans.lifeline.*;
import com.sqlconnector.demo.javabeans.secondarydisaster.*;
import org.apache.commons.io.FileUtils;
import org.hibernate.stat.Statistics;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadInJson {
    private static String MSCode;
    public ReadInJson(){

    }

    //获取某个数据源下的所有文件
    public static void getFiles(String path,ArrayList<Data> datas) throws IOException {
        List<File> fileList=new ArrayList<>();
        File file=new File(path);
        MSCode=file.getName();
        //5System.out.println(MSCode);
        //System.out.println(file.getAbsolutePath());
        //获取目录下的所有文件/文件夹
        File[] files=file.listFiles();
        if(files==null){
            System.out.println("this is null");
            return;
        }
        //遍历目录下的所有文件或文件夹
        for(File f : files){
            if(f.isFile()){
                fileList.add(f);
                //System.out.println(f.getAbsolutePath());
            }else if(f.isDirectory()){
                //System.out.println(f.getAbsolutePath());
                getFiles(f.getAbsolutePath(),datas);
            }
        }
        for(File f1:fileList){
            System.out.println(f1.getName());
            readJson(f1, MSCode, datas);

        }

    }

    //将一个json文件读取为一个Data对象data,返回一个datas储存新增的所有数据
    public static void readJson(File file,String MSCode,ArrayList<Data> datas)
            throws IOException {
        System.out.println("开始读取文件:"+file.getName());
        //获取JSON文件内容，并转化为字符串类型
        String jsonStr=FileUtils.readFileToString(file);

        //将字符串转化为jsonObject
        JSONObject jsonObject= JSON.parseObject(jsonStr);

        //获取文件内容的ID确定type
        String id=jsonObject.getString("Code");
        //System.out.println(id);
        String type=id.substring(13,15);
        //System.out.println(type);

        //根据type将选择合适的javaBean存储数据
        Object javaBean = new Object();
        switch(type){
            //人员伤亡及失踪
            case "11":
                DeathStatistics ds=new DeathStatistics();
                ds.add(jsonObject);
                ds.setReportingUnit(MSCode+"-"+ds.getReportingUnit());
                datas.add(new Data(ds,type));
            case "12":
                InjuredStatistics js=new InjuredStatistics();
                js.add(jsonObject);
                js.setReportingUnit(MSCode+"-"+js.getReportingUnit());
                datas.add(new Data(js,type));
            case "13":
                MissingStatistics ms=new MissingStatistics();
                ms.add(jsonObject);
                ms.setReportingUnit(MSCode+"-"+ms.getReportingUnit());
                datas.add(new Data(ms,type));
            //房屋破坏
            case "21":
                CivilStructure cs=new CivilStructure();
                cs.add(jsonObject);
                cs.setReportingUnit(MSCode+"-"+cs.getReportingUnit());
                datas.add(new Data(cs,type));
            case "22":
                BrickwoodStructure bs=new BrickwoodStructure();
                bs.add(jsonObject);
                bs.setReportingUnit(MSCode+"-"+bs.getReportingUnit());
                datas.add(new Data(bs,type));
            case "23":
                MasonryStructure ms2=new MasonryStructure();
                ms2.add(jsonObject);
                ms2.setReportingUnit(MSCode+"-"+ms2.getReportingUnit());
                datas.add(new Data(ms2,type));
            case "24":
                FrameworkStructure fs=new FrameworkStructure();
                fs.add(jsonObject);
                fs.setReportingUnit(MSCode+"-"+fs.getReportingUnit());
                datas.add(new Data(fs,type));
            case "25":
                OtherStructure os=new OtherStructure();
                os.add(jsonObject);
                os.setReportingUnit(MSCode+"-"+os.getReportingUnit());
                datas.add(new Data(os,type));
            //生命线工程灾情
            case "31":
                TrafficDisaster td=new TrafficDisaster();
                td.add(jsonObject);
                td.setReportingUnit(MSCode+"-"+td.getReportingUnit());
                datas.add(new Data(td,type));
            case "32":
                WaterDisaster wd=new WaterDisaster();
                wd.add(jsonObject);
                wd.setReportingUnit(MSCode+"-"+wd.getReportingUnit());
                datas.add(new Data(wd,type));
            case "33":
                OilDisaster od=new OilDisaster();
                od.add(jsonObject);
                od.setReportingUnit(MSCode+"-"+od.getReportingUnit());
                datas.add(new Data(od,type));
            case "34":
                GasDisaster gd =new GasDisaster();
                gd.add(jsonObject);
                gd.setReportingUnit(MSCode+"-"+gd.getReportingUnit());
                datas.add(new Data(gd,type));
            case "35":
                PowerDisaster pd=new PowerDisaster();
                pd.add(jsonObject);
                pd.setReportingUnit(MSCode+"-"+pd.getReportingUnit());
                datas.add(new Data(pd,type));
            case "36":
                CommDisaster cd=new CommDisaster();
                cd.add(jsonObject);
                cd.setReportingUnit(MSCode+"-"+cd.getReportingUnit());
                datas.add(new Data(cd,type));
            case "37":
                IrrigationDisaster id2=new IrrigationDisaster();
                id2.add(jsonObject);
                id2.setReportingUnit(MSCode+"-"+id2.getReportingUnit());
                datas.add(new Data(id2,type));
            //次生灾害
            case "41":
                CollapseRecord cr=new CollapseRecord();
                cr.add(jsonObject);
                cr.setReportingUnit(MSCode+"-"+cr.getReportingUnit());
                datas.add(new Data(cr,type));
            case "42":
                LandslideRecord lr=new LandslideRecord();
                lr.add(jsonObject);
                lr.setReportingUnit(MSCode+"-"+lr.getReportingUnit());
                datas.add(new Data(lr,type));
            case "43":
                DebrisRecord dr=new DebrisRecord();
                dr.add(jsonObject);
                dr.setReportingUnit(MSCode+"-"+dr.getReportingUnit());
                datas.add(new Data(dr,type));
            case "44":
                KarstRecord kr=new KarstRecord();
                kr.add(jsonObject);
                kr.setReportingUnit(MSCode+"-"+kr.getReportingUnit());
                datas.add(new Data(kr,type));
            case "45":
                CrackRecord cr2=new CrackRecord();
                cr2.add(jsonObject);
                cr2.setReportingUnit(MSCode+"-"+cr2.getReportingUnit());
                datas.add(new Data(cr2,type));
            case "46":
                SettlementRecord sr=new SettlementRecord();
                sr.add(jsonObject);
                sr.setReportingUnit(MSCode+"-"+sr.getReportingUnit());
                datas.add(new Data(sr,type));
            case "47":
                OtherRecord or=new OtherRecord();
                or.add(jsonObject);
                or.setReportingUnit(MSCode+"-"+or.getReportingUnit());
                datas.add(new Data(or,type));
            //震情
            case "51":
                DisasterInfo di=new DisasterInfo();
                di.add(jsonObject);
                di.setReportingUnit(MSCode+"-"+di.getReportingUnit());
                datas.add(new Data(di,type));
            case "52":
                DisasterPrediction dp=new DisasterPrediction();
                dp.add(jsonObject);
                dp.setReportingUnit(MSCode+"-"+dp.getReportingUnit());
                datas.add(new Data(dp,type));
                break;
        }

    }


}
