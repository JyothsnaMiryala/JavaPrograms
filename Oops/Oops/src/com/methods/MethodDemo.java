package com.methods;

public class MethodDemo {

	public static void main(String[] args) {
		System.out.println("main() method ");
		MethodDemo m= new MethodDemo();
		m.m1();

	}

	private void m1() {
		System.out.println("This is m1() method");
		m2();
		
	}

	private void m2() {
		System.out.println("This is m2() method");
		
	}

}
