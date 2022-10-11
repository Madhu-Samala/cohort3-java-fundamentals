package com.qa.java.collections.list;

import java.util.LinkedList;

import com.qa.java.collections.set.Employee;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<Employee> empList = new LinkedList<>();
		empList.add(new Employee(111,"emp1",3456.56));
		empList.add(new Employee(222,"emp2",4456.56));
		empList.add(new Employee(555,"emp5",5456.56));
		empList.add(new Employee(444,"emp4",6456.56));
		empList.add(new Employee(222,"emp2",4456.56));
		empList.add(new Employee(333,"emp3",8456.56));
		
		System.out.println(empList);
		System.out.println(empList.size());
		
		for(int index = 0 ; index < empList.size(); index++) {
			System.out.println(empList.get(index));
		}
		
		for(Employee emp : empList) {
			System.out.println(emp);
		}

	}

}
