package com.qa.java.strings;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abcd");
		String username = "qa@123";
		sb.append("hello");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		StringBuffer usernamesb= new StringBuffer(username);
		usernamesb.reverse();
		username = usernamesb.toString();
		System.out.println(username);
		

	}

}
