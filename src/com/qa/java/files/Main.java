package com.qa.java.files;

import com.qa.java.oop.Employee;

public class Main {

	public static void main(String[] args) {
		
		EmpRepository repository = new EmpRepository();
		String empFilePath = "C://qa//employees.csv";
		Employee[] employees = repository.readEmpCSVFile(empFilePath); //ctrl+2 , L
		for(Employee emp : employees) {
			emp.displayEmpInfo();
		}

	}

}
