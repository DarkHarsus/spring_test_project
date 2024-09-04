package com.harsiyanin.spring.rest.dao;

import com.harsiyanin.spring.rest.entity.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeDAO {

    List<Employee> getAllEmployees();

    Map<String, Employee> getEmployeesMap(Employee employee); //test

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
