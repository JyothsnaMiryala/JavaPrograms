package com.methodOverriding;

public class Parent {
   void m1() {
	   System.out.println("Parent class implementation");
   }
}
class Child extends Parent{
	void m1() {
		System.out.println("Child class implementation");
	}
}

