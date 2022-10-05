package com.qa.java.arrays;


public class ArraysTest {

	public static void main(String[] args) {

		// int id; // single int primitive
		int[] ids; // an array of int (reference)
		ids = new int[3]; // instantiation (creating an array object)
		ids[0] = 111;
		ids[1] = 222;
		ids[2] = 333;

		System.out.println(ids[1]);
		// Manipulate
		for (int index = 0; index < ids.length; index++) {
			System.out.println(ids[index]);
		}

		// for-each statement (loop)
		for (int id : ids) {
			System.out.println(id);
		}

		char[] genders = { 'M', 'F', 'F', 'M', 'M', 'M' };
		System.out.println(genders.length);
		System.out.println(genders[3]);

		for (char gender : genders) {
			System.out.println(gender);
		}

		// write to find out how many males are there?

		ArrayUtil util = new ArrayUtil();
		int maleCount = util.getMaleGenderCount(genders);
		System.out.println("Male Count : " + maleCount);

		double[] salaries = { 111.23, 43543.34, 34534.34, 345345.3453 };
		// update salaries with 10% hike

		util.incrementSalaries(salaries);

		for (double salary : salaries) {
			System.out.println(salary);
		}

		// Array of Objects
		Employee emp1 = new Employee(111, "emp1", 10000.34f, "development", (byte) 25, 'M', 8.5f);
		Employee emp2 = new Employee(222, "emp2", 20000.34f, "QA", (byte) 26, 'F', 6.8f);

		/*Employee[] emps;
		emps = new Employee[5];
		System.out.println(emps[0]);
		emps[0] = new Employee(111, "emp1", 10000.34f, "development", (byte) 25, 'M', 8.5f);
		emps[1] = new Employee(222, "emp2", 20000.34f, "QA", (byte) 26, 'F', 6.8f);
		emps[2] = new Employee(333, "emp3", 30000.34f, "development", (byte) 28, 'M', 6.7f);
		emps[3] = new Employee(444, "emp4", 40000.34f, "QA", (byte) 29, 'F', 8.8f);
		emps[4] = new Employee(555, "emp5", 50000.34f, "QA", (byte) 230, 'F', 9.8f);*/

		Employee[] emps = {
				 new Employee(111, "emp1", 100000.34f, "development", (byte) 25, 'M', 8.5f),
				 new Employee(222, "emp2", 200000.34f, "QA", (byte) 26, 'F', 6.8f),
				 new Employee(333, "emp3", 30000.34f, "development", (byte) 28, 'M', 6.7f),
				 new Employee(444, "emp4", 200000.34f, "QA", (byte) 29, 'F', 8.8f),
				 new Employee(555, "emp5", 50000.34f, "QA", (byte) 230, 'F', 9.8f)
		};
		
		System.out.println(emps.length);
		
		for(Employee emp : emps) {
			emp.displayEmpInfo();
		}
		
		for(Employee emp: emps) {
			System.out.println(emp.name + "'s Total Salary is : $" + emp.totalSalary());
		}
		
		Employee employeeWithHighestSalary = util.getEmployeeWithHighestSalary(emps);
		System.out.println(employeeWithHighestSalary.name);
	}

}
