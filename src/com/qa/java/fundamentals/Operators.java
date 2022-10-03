package com.qa.java.fundamentals;

public class Operators {

	public static void main(String[] args) {

		short salary;
		salary = 32145;
		// Type Conversion
		// short incrementedSalary = (short) (salary * 10 / 100) ;
		// float incrementedSalary = (float)salary * 10 / 100 ;
		//float incrementedSalary = (float) (salary * 10.0 / 100);
		double incrementedSalary = salary * 10.0 / 100;
		System.out.println("Incremented Salary : " + incrementedSalary);
		// (35359) (-32768 to +32767 )
		// salary = (short) (salary + incrementedSalary);

		double totalSalary;
		totalSalary = salary + incrementedSalary;

		System.out.println("Total Salary : " + totalSalary);
		
		int no1,no2;
		no1 = 100;
		no2 = 200;
		
		System.out.println(++no1);
		System.out.println(no1);
		
		System.out.println(no2--);
		System.out.println(no2);
		//compound statement
		salary = 10000;
		//salary = (short) (salary + 100 );
		salary += 100; //(salary = salary + 100)
		System.out.println(salary);
		
		//Relational Operators
		
		System.out.println(salary > 50000);
		System.out.println(salary >= 50000);
		System.out.println(salary < 50000);
		System.out.println(salary <= 50000);
		System.out.println(salary == 50000);
		System.out.println(salary != 50000);
		
		//Logical Operators
		
		salary = 10000;
		char department = 'D';
		
		System.out.println( (salary >= 10000 ) && (department == 'Q'));
		
		System.out.println( (salary >= 10000 ) || (department == 'Q'));
			

	}

}
