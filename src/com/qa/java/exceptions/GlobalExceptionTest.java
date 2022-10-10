package com.qa.java.exceptions;

import com.qa.java.oop.Employee;

public class GlobalExceptionTest {

	public static void main(String[] args) {
		try {
			int no1 = 100;
			int no2 = 10;
			int res = no1 / no2;
			System.out.println("Result : " + res);
			int[] nos = new int[3];
			nos[2] = 100;
			Employee employee = null;
			System.out.println(employee.name);
		} catch(Exception e) {
			//if code is independent of exception type
			System.out.println("Exception handled...");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
