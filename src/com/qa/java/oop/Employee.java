package com.qa.java.oop;

public class Employee {
	
	//State
	//instance variables
	public int id;
	public String name;
	public float salary;
	public String department;
	public byte age;
	public char gender;
	public float incrementPercentage;
	
	static final String COMPANY_NAME = "QA"; // class specific
	static final double COMPANY_REVENUE = 43534534.345;
	static final String COMPANY_EMAIL = "contact@qa.com";
	
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
	
	public Employee(int id, String name, float salary, String department, byte age, char gender,float incrementPercentage) {	
		System.out.println("Employee(....) arg construtor is invoked...");
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.age = age;
		this.gender = gender;
		this.incrementPercentage = incrementPercentage;
	}
	
	//behaviors ( methods )
	//instance method
	public void displayEmpInfo() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Department : " + department);
		System.out.println("Salary : " + salary);
		System.out.println("Age : " + age);
		System.out.println("Gender : " + gender);
	}
	
	/*
	 * method to calculate the incremented salary
	 */
	float incrementedSalary() {
		return (salary * incrementPercentage / 100 );
	}
	
	/*
	 * Method to calculate the total salary
	 */
    float totalSalary() {
    	return salary + incrementedSalary();
    } 
    
    static void companyInfo() {
    	System.out.println("Company Name : " + COMPANY_NAME);
    	System.out.println("Company Annual Revenue : " + COMPANY_REVENUE);
    	System.out.println("Company Contact Email : " + COMPANY_EMAIL);
    }
}
