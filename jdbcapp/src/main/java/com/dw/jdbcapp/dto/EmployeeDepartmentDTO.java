package com.dw.jdbcapp.dto;

import java.time.LocalDate;

public class EmployeeDepartmentDTO {
    private LocalDate hireDate;
    private String departmentName;
    private String employeeName;

    public EmployeeDepartmentDTO() {
    }

    public EmployeeDepartmentDTO(LocalDate hireDate, String departmentName, String employeeName) {
        this.hireDate = hireDate;
        this.departmentName = departmentName;
        this.employeeName = employeeName;
    }

}
