package com.sqlconnector.demo.dao;

import com.sqlconnector.demo.domain.Information;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InformationDAO extends JpaRepository<Information, Character> {
}
