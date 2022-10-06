package com.qa.java.arrays;

public class ArrayUtil {

	// method to calculate the male gender count
	int getMaleGenderCount(char[] genders) {
		int count = 0;
		for (char gender : genders) {
			if (gender == 'M')
				count++;
		}
		return count;
	}

	void incrementSalaries(double[] salaries) {
		for (int index = 0; index < salaries.length; index++) {
			salaries[index] = salaries[index] + (salaries[index] * 10 / 100);
		}
	}
   //Ctrl+A
	//Ctrl+shift+f
	// Method Who is drawing highest salary

	Employee getEmployeeWithHighestSalary(Employee[] emps) {
		Employee employee = emps[0];
		float highestSalary = emps[0].totalSalary();
		for (Employee emp : emps) {
			if (emp.totalSalary() > highestSalary) {
				employee = emp;
				highestSalary = emp.totalSalary();
			}
		}
		return employee;
	}

}
