package com.qa.java.wrapping;

public class Main {

	public static void main(String[] args) {
		int salary = 334534;
		
		/*Integer salaryObject = new Integer(salary);
		
		double salaryDouble = salaryObject.doubleValue(); */
		//Autoboxing
		Integer salaryObject = salary;
		String salaryInput = "2342 34234";
		try {
		salary = Integer.parseInt(salaryInput);
		System.out.println("salary is : " + salary);
		} catch(NumberFormatException e) {
			System.out.println("invalid input");
		}
		try {
		System.out.println(div(100,0));
		} catch(ArithmeticException e) {
			System.out.println("Number shouldn't be 0");
		}
	}
	
	static int div(int no1, int no2) {
		return no1 / no2;
	}

}
