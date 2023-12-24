package com.dipika.basic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dipika.basic.entity.Employee;
import com.dipika.basic.service.EmployeeService;


@RestController
public class EmployeeController 
{
	@Autowired
	private EmployeeService employeeService;
	
	  //http://localhost:8080/addRecord
	  @PostMapping("addRecord")
	   public String addRecord(@RequestBody Employee employee)
	   {
		   return  employeeService.addRecord(employee);
		   
	   }
	  
	  //http://localhost:8080/findAllObject
	  @GetMapping("findAllObject")
	  public List<Employee> getAllEmployeeObject()
	  {
		return employeeService.getAllEmployee();
	  }

	  //http://localhost:8080/removeRecordById
	  @DeleteMapping("removeRecordById")
     public  String removeRecordById(@RequestParam Integer empNumber)
     {
		return employeeService.deleteRecord(empNumber);
    	 
     }
	  
	  //http://localhost:8080/getEmployeeObjectById/102
	  @GetMapping("getEmployeeObjectById/{empNumber}")
     public Employee getEmployeeObjectById(@PathVariable Integer empNumber)
     {
		return employeeService.getEmployeeById(empNumber);
    	 
     }
	  
	  //http://localhost:8080/modifyEmployeeObject
	  @PutMapping("modifyEmployeeObject")
     public String modifyEmployeeObject(@RequestBody Employee employee)
     {
		return employeeService.updateRecord(employee);
    	 
     }

}
