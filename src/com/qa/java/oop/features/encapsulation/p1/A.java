package com.qa.java.oop.features.encapsulation.p1;

 public class A {
	
	int value = 100;
	
	public A(){
		System.out.println("A() constructor");
	}
	
	
	protected void m1() {
		System.out.println("void m1() A...");
	}
	
	public static void main(String[] args) {
		A a;
		a = new A();
		System.out.println(a.value);
		a.m1();
	}

}
