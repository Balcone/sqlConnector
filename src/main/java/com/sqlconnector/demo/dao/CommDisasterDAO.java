package com.sqlconnector.demo.dao;

import com.sqlconnector.demo.domain.Commdisaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommDisasterDAO extends JpaRepository<Commdisaster, Character> {
}
