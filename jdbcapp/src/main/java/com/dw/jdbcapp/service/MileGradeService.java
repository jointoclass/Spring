package com.dw.jdbcapp.service;

import com.dw.jdbcapp.model.MileGrade;
import com.dw.jdbcapp.repository.jdbc.MileGradeJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MileGradeService {
    @Autowired
    MileGradeJdbcRepository mileGradeRepository;

    public List<MileGrade> getAllMileGrade() {
        return mileGradeRepository.getAllMileGrade();
    }
}