package com.sqlconnector.demo.service;

import com.sqlconnector.demo.dao.CommDisasterDAO;
import com.sqlconnector.demo.domain.Commdisaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CommDisasterService {
    @Autowired
    private CommDisasterDAO commDisasterDAO;

    //查询所有
    public List<Commdisaster> findAll(){
        return commDisasterDAO.findAll();
    }
}
