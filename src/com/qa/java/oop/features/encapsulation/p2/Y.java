package com.qa.java.oop.features.encapsulation.p2;

import com.qa.java.oop.features.encapsulation.p1.A;

public class Y extends A {
	public static void main(String[] args) {
		A a;
		a = new A();
		//System.out.println(a.value); Not visible
		//a.m1(); // not visible through base class
		Y y = new Y();
		y.m1();
	}
}
