package com.qa.java.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.qa.java.oop.Employee;

public class EmpRepository {

	Employee[] readEmpCSVFile(String filePath) {
		Employee[] emps = new Employee[3];
		// Try with Resource ( Java 7 )
		try (BufferedReader br = new BufferedReader(new FileReader(new File(filePath)))) {
			System.out.println(br.readLine()); // To Read headers
			String empData = br.readLine();
			int index = 0;
			while (empData != null) {
				System.out.println(empData); // 1,emp1,343453.34,development,26,M,8.3
				String[] empInfo = empData.split(",");
				int id = Integer.parseInt(empInfo[0]);
				String name = empInfo[1];
				float salary = Float.parseFloat(empInfo[2]);
				String department = empInfo[3];
				byte age = Byte.parseByte(empInfo[4]);
				char gender = empInfo[5].charAt(0);
				float discountPercentage = Float.parseFloat(empInfo[6]);
				Employee employee = new Employee(id, name, salary, department, age, gender, discountPercentage);
				emps[index] = employee;
				index++;
				empData = br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return emps;
	}

}
