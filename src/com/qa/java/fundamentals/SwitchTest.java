package com.qa.java.fundamentals;

public class SwitchTest {

	public static void main(String[] args) {
		// Menu Driven application

		byte day;
		day = 20;
		switch (day) {
		case 1:
			System.out.println("Day1 Schedule");
			break;
		case 2:
			System.out.println("Day2 Schedule");
			break;
		case 3:
			System.out.println("Day3 Schedule");
			break;
		case 4:
			System.out.println("Day4 Schedule");
			break;
		case 5:
			System.out.println("Day5 Schedule");
			break;
		case 6:
			System.out.println("Day6 Schedule");
			break;
		case 7:
			System.out.println("Day7 Schedule");
			break;
		default:
			System.out.println("Schedule not found");

		}

		char input;
		input = 'N';
		switch (input) {
		case 'Y':
			System.out.println("Continue code");
			break;
		case 'N':
			System.out.println("Exit code");
			break;
		default:
			System.out.println("Invalid input");
		}
		if(input == 'Y') {
			System.out.println("Continue Code");
		} else if(input == 'N') {
			System.out.println("Exit code");
		} else {
			System.out.println("Invalid Input");
		}

	}

}
