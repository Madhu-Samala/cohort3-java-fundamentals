package com.qa.java.oop;

public class Main {

	public static void main(String[] args) {
		//create an object
		Employee emp1;
		emp1 = new Employee(111,"emp1",10000.34f,"development",(byte)25,'M',8.5f);
		System.out.println(emp1.name);
		System.out.println(emp1.salary);
		/*
		 * emp1.id = 111; emp1.name = "emp1"; emp1.department = "development"; emp1.age
		 * = 25; emp1.salary = 34534.34f; emp1.gender = 'M';
		 */
		/*
		 * System.out.println("Id : " + emp1.id); System.out.println("Name : " +
		 * emp1.name); System.out.println("Department : " + emp1.department);
		 * System.out.println("Salary : " + emp1.salary); System.out.println("Age : " +
		 * emp1.age); System.out.println("Gender : " + emp1.gender);
		 */
		
		emp1.displayEmpInfo();
		
		float incrementedSalary = emp1.incrementedSalary();
		System.out.println("Incremented Salary for emp1 : " + incrementedSalary);
		System.out.println(emp1.name + "'s total salary: " + emp1.totalSalary());
		
		Employee emp2;
		emp2 = new Employee(222,"emp2",20000.34f,"QA",(byte)26,'F',6.8f);
		
		System.out.println(emp2.name);
		/*
		 * emp2.id = 222; emp2.name = "emp2"; emp2.department = "QA"; emp2.salary =
		 * 564645.3f; emp2.age = 30; emp2.gender = 'F';
		 */
		emp2.displayEmpInfo();
		
		System.out.println(emp2.name + "'s incremented salary : " + emp2.incrementedSalary());
		System.out.println(emp2.name + "'s total salary : " + emp2.totalSalary());
		/*
		int x;
		x = 10;*/
	}

}
