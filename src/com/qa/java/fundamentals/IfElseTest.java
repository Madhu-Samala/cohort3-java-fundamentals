package com.qa.java.fundamentals;

public class IfElseTest {

	public static void main(String[] args) {
	
		//Write a code to check whether the given no is an even no or not 
		int no;
		no = 3456;
		if(no % 2 == 0) {
			System.out.println(no + " is an even number");
		} else {
			System.out.println(no + " is an odd number");
		}
		
		/* if an employee belongs to development department and his experience is greater
		 * 5 years, then his increment percentage is 10%
		 * else if an employee belongs to qa department and his experience is greater than 
		 * 5 years, then his increment percentage is 8%
		 * else
		 * employee increment percentage is 5%
		 */
		
		char empDept = 'S';
		float empSalary = 30000.0f;
		byte empExp = 10;
		float incrementPercentage ;
		
		if(empDept == 'D' && empExp > 5) {
			incrementPercentage = 10.0f;
		} else if(empDept == 'Q' && empExp > 5) {
			incrementPercentage = 8.0f;
		} else {
			incrementPercentage = 5.0f;
		}
		
		float empTotalSalary;
		empTotalSalary = empSalary + ( empSalary * incrementPercentage / 100 );
		System.out.println("Total Salary afte increment : " + empTotalSalary);
	}

}
