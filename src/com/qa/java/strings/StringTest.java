package com.qa.java.strings;

public class StringTest {

	public static void main(String[] args) {

		String str1 = new String();
		System.out.println(str1);
		
		char[] chs = {'a','b','c','d'};
		String str2 = new String(chs);
		System.out.println(str2);
		
		String str3 = new String("abcd");
		System.out.println(str3);
		
		System.out.println(str2 == str3);
		
		String str4;
		str4 = str2;
		
		System.out.println(str2 == str4);
		
		String str5 = "xyz"; //literal
		str2 = str5; 
		String str6 = "xyz";
		System.out.println(str2 == str5);
		System.out.println(str5);
		System.out.println(str2);
		System.out.println(str4);
		System.out.println(str5 == str6);
		
		
		//String manipulation
		System.out.println(str2.charAt(2));
		System.out.println(str2.compareToIgnoreCase("XyZ"));
		//String objects are immutable
		str2 = "xyz";
		str2 = str2.concat(" hello ");
		System.out.println(str2);
		
		String username = "qa";
		String password = "qa@123   ";
		
		if(username.equalsIgnoreCase("QA") && password.trim().equals("qa@123")) {
			System.out.println("Login Success!!!");
		} else {
			System.out.println("Invalid Credentials !!!");
		}
		System.out.println(password.length());
		
		//patterns
		//alphanumeric ( a-z  A-Z 0-9 _ .)
		//Regular Expression
		
		String empData = "111,emp1,emp1@gmail.com,34534.345";
		String[] empDataSplit = empData.split(",");
		for(String data : empDataSplit) {
			System.out.println(data);
		}
		
		String uname  = "    qa 123    ";
		System.out.println(uname.trim());
		System.out.println(uname.replace(" ", ""));
		
	}

}
