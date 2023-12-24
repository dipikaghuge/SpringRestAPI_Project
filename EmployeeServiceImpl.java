package com.dipika.basic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dipika.basic.dao.EmployeeDao;
import com.dipika.basic.entity.Employee;

@Service
public class EmployeeServiceImpl  implements EmployeeService
{
	@Autowired
   private EmployeeDao employeeDao;
   
   public String addRecord(Employee employee)
   {
	   employeeDao.save(employee);
	   return "Save my object";
	   
   }

@Override
public List<Employee> getAllEmployee()
{
	return employeeDao.findAll();
}

@Override
public String deleteRecord(Integer empNumber) {
	employeeDao.deleteById(empNumber);
	return "Remove employee object";
}

@Override
public Employee getEmployeeById(Integer empNumber) {
	return employeeDao.findById(empNumber).get();
}

@Override
public String updateRecord(Employee employee) {
	employeeDao.saveAndFlush(employee);
	return "update employee object";
}
   
}
