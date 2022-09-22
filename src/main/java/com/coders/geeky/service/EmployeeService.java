package com.coders.geeky.service;


import com.coders.geeky.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee addEmployee(Employee employee);

    void deleteEmployee(Long employeeId);
}