package com.qa.java.oop;

public class CallByValueTest {

	public static void main(String[] args) {

		int no1,no2;
		no1 = 100;
		no2 = 200;
		//Call By Value
		int res = Util.add(no1, no2);
		System.out.println("Result: " + res);
		System.out.println("no1 in main : " + no1);
		System.out.println("no2 in main : " + no2);
	}

}
