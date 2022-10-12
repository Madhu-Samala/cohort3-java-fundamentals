package com.qa.java.collections.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

import com.qa.java.collections.set.Employee;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee(111, "emp1", 3456.56);
		Employee emp2 = new Employee(222, "emp2", 4456.56);
		Employee emp5 = new Employee(555, "emp5", 5456.56);
		Employee emp4 = new Employee(444, "emp4", 6456.56);
		Employee emp6 = new Employee(222, "emp2", 4456.56);
		Employee emp3 = new Employee(333, "emp3", 8456.56);

		LinkedHashMap<Integer, Employee> empMap = new LinkedHashMap<>();
		empMap.put(111, emp1); // 111 -> emp1 object
		empMap.put(222, emp2);
		empMap.put(333, emp3);
		empMap.put(444, emp4);
		empMap.put(555, emp5);

		System.out.println(empMap);

		System.out.println(empMap.get(888));

		Set<Entry<Integer, Employee>> empEntrySet = empMap.entrySet();

		Iterator<Entry<Integer, Employee>> iterator = empEntrySet.iterator();
		while (iterator.hasNext()) {
			Entry<Integer, Employee> entry = iterator.next();
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}

		// TODO Auto-generated method stub

	}

}
