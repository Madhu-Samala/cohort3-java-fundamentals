package com.qa.java.lambda;

public class Main {

	public static void main(String[] args) {
		/*
		Calculator calculator = new Calculator() {
			
			@Override
			public int add(int no1, int no2) {
				// TODO Auto-generated method stub
				return no1 + no2;
			}
		};
		
		System.out.println(calculator.add(100, 200)); */
		/* Lambda Expression */
		Calculator calculator = (no1,no2) ->{
			return no1 + no2;
		};
		
		System.out.println(calculator.add(100, 200));

	}

}
