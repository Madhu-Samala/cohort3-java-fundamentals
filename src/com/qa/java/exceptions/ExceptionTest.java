package com.qa.java.exceptions;

import com.qa.java.oop.Employee;

public class ExceptionTest {

	public static void main(String[] args) {
		System.out.println("Exception Example");
		try {
			try {
				input();
				int no1 = 100;
				int no2 = 0;
				int res = no1 / no2;
				System.out.println("Result : " + res);
			} catch (ArithmeticException ex) {
				System.out.println("Please enter a non-zero number");
				input();
			}
			try {
				int[] nos = new int[3];
				nos[5] = 100;
			} catch (NegativeArraySizeException ex) {
				System.out.println("Array size must be positive");
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Array index must be between 0 to 2");
			}
			try {
				Employee employee = null;
				System.out.println(employee.name);
			} catch (NullPointerException ex) {
				System.out.println("employee is null");
			}

		} catch (Exception e) {
			System.out.println("Exception occured");
		}

		/*
		 * catch(ArithmeticException ex) {
		 * System.out.println("Please enter a non-zero number"); input(); }
		 * catch(NegativeArraySizeException ex) {
		 * System.out.println("Array size must be positive"); }
		 * catch(ArrayIndexOutOfBoundsException ex) {
		 * System.out.println("Array index must be between 0 to 2"); }
		 * catch(NullPointerException ex) { System.out.println("employee is null"); }
		 */

		Employee emp;
		try {
			emp = Util.findById(666);
			System.out.println(emp.name);
		} catch (EmployeeNotFoundException  e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		} finally {
			System.out.println("Finally executed");
		}

	}

	private static void input() {
		System.out.println("Enter input");

	}

}
