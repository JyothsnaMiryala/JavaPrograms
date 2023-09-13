package com.stackOverFlow;

public class Demo {
	public void m1() {
		System.out.println("m1() method started");
		m2();
	}

	public void m2() {
		System.out.println("m2() method started");
		m1();

	}

	public static void main(String[] args) {
		System.out.println("main() method started");
		Demo d = new Demo();
		d.m1();
		System.out.println("main() method ended");

	}

}
