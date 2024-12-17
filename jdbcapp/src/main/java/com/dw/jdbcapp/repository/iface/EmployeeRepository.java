package com.dw.jdbcapp.repository.iface;

import com.dw.jdbcapp.model.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeRepository {
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(String id);
    public List<Map<String,Object>> getEmployeesWithDepartName();
    public List<Employee> getEmployeesWithDepartmentAndPosition(String departmentNumber, String position);
    public Employee saveEmployee(Employee employee);
}
