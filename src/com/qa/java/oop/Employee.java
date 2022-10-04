package com.qa.java.oop;

public class Employee {
	
	//State
	int id;
	String name;
	float salary;
	String department;
	byte age;
	char gender;
	
	//No-arg Constructor
	Employee(){
		System.out.println("Employee() constructor is called...");
		id = 111;
		name = "emp1";
		salary = 34534.34f;
		department = "development";
		age = 25;
		gender = 'M';
	}

	
	
	//Arg Constructor
	
	public Employee(int id, String name, float salary, String department, byte age, char gender) {	
		System.out.println("Employee(....) arg construtor is invoked...");
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.age = age;
		this.gender = gender;
	}

}
