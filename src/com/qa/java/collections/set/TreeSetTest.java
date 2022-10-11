package com.qa.java.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		/*
		TreeSet<String> hs = new TreeSet<>();
		hs.add("a");
		hs.add("b");		
		hs.add("x");
		hs.add("b");
		hs.add("c");
		hs.add("l");
		hs.add("d");
		
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
		
		TreeSet<Employee> employeeSet = new TreeSet<>();
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
