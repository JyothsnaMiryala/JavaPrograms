package com.methodStack;

public class Demo1 {
	public void m1(int a, int b) throws Exception {
		System.out.println("m1() method started");

		int c = a / b;
		System.out.println(c);

		System.out.println("m1() ended");
	}

	public static void main(String[] args)throws Exception {
		System.out.println("main() method started");
		Demo1 d = new Demo1();
		d.m1(10, 0);
		System.out.println("main() method ended");
	}
}
