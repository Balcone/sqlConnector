package com.sqlconnector.demo.service;

import com.sqlconnector.demo.dao.InformationDAO;
import com.sqlconnector.demo.domain.Information;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class InformationService {
    @Autowired
    private InformationDAO informationDAO;
    //插入一条信息
    public void addInformation(Information information){
        informationDAO.save(information);
    }

    //修改一条信息(jpa是根据id来修改的)
    public void  updateInformation(Information information){
        informationDAO.save(information);
    }
    //根据id删除一条数据
    public void deleteInformationById(char id){
//        informationDAO.deleteByID(id);
    }

    //查询所有
    public List<Information> findAll(){
        return informationDAO.findAll();
    }

    //根据id查询一条数据(2.0后不能使用findOne了)
    public void findInformationById(char id){
//        return informationDAO.findByID(id).get(0);
    }
}
