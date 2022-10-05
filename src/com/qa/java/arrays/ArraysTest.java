package com.qa.java.arrays;

public class ArraysTest {

	public static void main(String[] args) {

		//int id; // single int primitive
		int[] ids; // an array of int (reference)
		ids = new int[3]; // instantiation (creating an array object)
		ids[0] = 111;
		ids[1] = 222;
		ids[2] = 333;
		
		System.out.println(ids[1]);
		//Manipulate
		for(int index = 0; index< ids.length ; index++) {
			System.out.println(ids[index]);
		}
		
		//for-each statement (loop)
		for(int id : ids) {
			System.out.println(id);
		}
		
		char[] genders = {'M','F','F','M','M','M'};
		System.out.println(genders.length);
		System.out.println(genders[3]);
		
		for(char gender : genders) {
			System.out.println(gender);
		}
		
		//write to find out how many males are there?
		
		ArrayUtil util = new ArrayUtil();
		int maleCount = util.getMaleGenderCount(genders);
		System.out.println("Male Count : " + maleCount);
		
		double[] salaries = {111.23,43543.34,34534.34,345345.3453};
		//update salaries with 10% hike
		
		util.incrementSalaries(salaries);
		
		for(double salary : salaries) {
			System.out.println(salary);
		}
		
		
		
		
	}

}
