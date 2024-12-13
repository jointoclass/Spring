package com.dw.jdbcapp.service;

import com.dw.jdbcapp.model.Employee;
import com.dw.jdbcapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllemployees() {
        return employeeRepository.getAllEmployees();
    }

    public Employee getEmployeeById(String id) {
        return employeeRepository.getEmployeeById(id);
    }

    public List<Map<String, Object>> getEmployeeWithDepartName() {
        return employeeRepository.getEmployeesWithDepartName();
    }
}