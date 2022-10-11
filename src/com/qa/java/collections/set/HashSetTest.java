package com.qa.java.collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
 /*
		HashSet<String> hs = new HashSet<>();
		hs.add("a");
		hs.add("b");		
		hs.add("x");
		hs.add("b");
		hs.add("c");
		
		System.out.println(hs.size());
		System.out.println(hs);
		
	Iterator<String> iterator = hs.iterator();
		while(iterator.hasNext()) {
			//System.out.println(iterator.next());
			String str =  iterator.next();
			str = str.toUpperCase();
			System.out.println(str);
		}
		
	*/
		/*
		 * How to check the equality of two objects
		 */
		Employee emp1 = new Employee(111,"emp1",3456.56);
		Employee emp2 = new Employee(111,"emp1",3456.56);
		
		HashSet<Employee> employeeSet = new HashSet<>();
		employeeSet.add(new Employee(111,"emp1",3456.56));
		employeeSet.add(new Employee(222,"emp2",4456.56));
		employeeSet.add(new Employee(555,"emp5",5456.56));
		employeeSet.add(new Employee(444,"emp4",6456.56));
		employeeSet.add(new Employee(222,"emp2",4456.56));
		employeeSet.add(new Employee(333,"emp3",8456.56));
		
		System.out.println(employeeSet.size());
		
		Iterator<Employee> iterator = employeeSet.iterator();
		while(iterator.hasNext()) {
			Employee employee = iterator.next();
			System.out.println(employee);
		}
		
	}

}
