package com.qa.java.oop;

public class Util {
	
	//Utility methods
	
	static int add(int no1 , int no2) {
		no1 = 1000;
		no2 = 2000;
		System.out.println("no1 in add : " + no1);
		System.out.println("no2 in add : " + no2);
		return no1 + no2;
	}
	
	static String getStudentName(Student student) {
		student.name = "student111";
		System.out.println("In getStudentName : " + student.name);
		return student.name;
	}
	
	public static void main(String[] args) {

		int no1,no2; // local variables (stack)
		no1 = 100;
		no2 = 200;
		//Call By Value
		int res = Util.add(no1, no2);
		System.out.println("Result: " + res);
		System.out.println("no1 in main : " + no1);
		System.out.println("no2 in main : " + no2);
		
		//Call By Reference
		
		Student student = new Student(111,"student1");
	
		System.out.println("Student Name : " + getStudentName(student));
	
		System.out.println("In main:" + student.name);
	}

}
