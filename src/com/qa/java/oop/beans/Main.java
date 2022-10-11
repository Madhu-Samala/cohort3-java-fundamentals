package com.qa.java.oop.beans;

public class Main {

	public static void main(String[] args) {

		Employee employee = new Employee();
		
		employee.setId(111);
		employee.setName("emp1");
		
		employee.setId(111)
		        .setName("emp1")
		        .setEmail("emp1@gmail.com");
		
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		
		System.out.println(employee);
		
		Employee employee2 = new Employee();
		employee2.setId(222)
		         .setName("emp2");
		
		System.out.println(employee2);
		
	}

}
