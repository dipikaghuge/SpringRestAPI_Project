package com.dipika.basic.service;

import java.util.List;

import com.dipika.basic.entity.Employee;

public interface EmployeeService 
{
	    String addRecord(Employee employee);
        List<Employee> getAllEmployee();
        String deleteRecord(Integer empNumber);
        Employee getEmployeeById(Integer empNumber);
        String updateRecord(Employee employee);
}

