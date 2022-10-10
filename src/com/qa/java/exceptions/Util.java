package com.qa.java.exceptions;

import com.qa.java.oop.Employee;

public class Util {
	
	static Employee findById(int id) throws EmployeeNotFoundException  {
		Employee emp = null;
	
		//code to initialize emp
		if(emp == null)
			throw new EmployeeNotFoundException("No Empoyee Found with this id");
		return emp;
	}

}
