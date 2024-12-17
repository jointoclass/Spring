package com.dw.jdbcapp.repository.iface;

import com.dw.jdbcapp.model.Department;

import java.util.List;

public interface DepartmentRepository {
    public List<Department> getAllDepartment();
    public Department saveDepartment(Department department);
    public Department updateDepartment(Department department);
    public String deleteDepartment(String id);
}
