package com.dw.jdbcapp.model;

import java.time.LocalDate;

public class Employee {
    private String employeeId;
    private String name; // 사원명
    private String englishName; // 영문이름
    private String position;
    private String gender;
    private LocalDate birthDate;
    private LocalDate hireDate;
    private String address;
    private String city;
    private String region;
    private String homePhone;
    private String supervisorId;
    private String departmentId;

    public Employee() {
    }

}