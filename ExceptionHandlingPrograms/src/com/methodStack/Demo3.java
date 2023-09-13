package com.methodStack;

public class Demo3 {
	public void m2(int a, int b) throws Exception {

		System.out.println("m2() method started");
		try {
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			throw new InvalidNumberException1("Invalid Number");
		}
		System.out.println("m2() - ended");
	}

	public void m1(int a, int b) throws Exception {
		System.out.println("m1() method started");
		m2(a, b);
		System.out.println("m1() method ended");
	}

	public static void main(String[] args) throws Exception {
		System.out.println("main() method started");
		try {
			Demo3 d = new Demo3();
			d.m1(10, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main() method ended");
	}
}