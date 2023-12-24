package com.dipika.basic.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee 
{
	@Id
	private  Integer  empNumber;
	private  String  empName;
	private  Float  empSalary;
		
}
