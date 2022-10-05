package com.qa.java.arrays;

public class ArrayUtil {
	
	//method to calculate the male gender count
	int getMaleGenderCount(char[] genders) {
		int count = 0;
		for(char gender : genders) {
			if(gender == 'M')
				count++;
		}
		return count;
	}
	
	void incrementSalaries(double[] salaries) {
		for(int index = 0 ; index < salaries.length; index++) {
			salaries[index] = salaries[index] + (salaries[index] * 10 / 100 );
		}
	}

}
