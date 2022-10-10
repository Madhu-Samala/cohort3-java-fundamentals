package com.qa.java.exceptions;

import com.qa.java.oop.Employee;

public class Util {
	
	static Employee findById(int id) throws EmployeeNotFoundException  {
		Employee emp = null;
		Employee[] emps = {
				 new Employee(111, "emp1", 100000.34f, "development", (byte) 25, 'M', 8.5f),
				 new Employee(222, "emp2", 200000.34f, "QA", (byte) 26, 'F', 6.8f),
				 new Employee(333, "emp3", 30000.34f, "development", (byte) 28, 'M', 6.7f),
				 new Employee(444, "emp4", 200000.34f, "QA", (byte) 29, 'F', 8.8f),
				 new Employee(555, "emp5", 50000.34f, "QA", (byte) 230, 'F', 9.8f)
		};
		for(Employee e : emps) {
			if(e.id == id)
				emp = e;
		}
		if(emp == null)
			throw new EmployeeNotFoundException("No Empoyee Found with this id");
		return emp;
	}

}
