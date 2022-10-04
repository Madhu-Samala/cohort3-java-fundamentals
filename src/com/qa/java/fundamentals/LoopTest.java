package com.qa.java.fundamentals;

public class LoopTest {

	public static void main(String[] args) {

		// while the given condition is true
		/* Print from 1 to 10 */
		/*
		int no = 11;
		while (no <= 10) {
			System.out.println(no);
			no++;
		} */

		// do-while
		/*
		int no = 11;
		do {
			System.out.println(no);
			no++;
		} while (no <= 10); */
		// Diff between while and do-while
		// if the condition is false, do-while executes once
		
		
		for(int no = 1; no <= 10; no++) {
			if(no == 5 )
				break;
				
			System.out.println(no);
		}

		//Nested loops
		/*
		 * 1
		 * 2 3
		 * 4 5 6
		 */
		
		for(int i = 1 ; i<=3 ; i++) {
			for(int j = 1; j<=3 ; j++) {
				System.out.println(i + " " + j);
			}
		}
	}

}
