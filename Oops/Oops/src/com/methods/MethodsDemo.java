package com.methods;

public class MethodsDemo {

	public static void main(String[] args) {
		MethodsDemo m = new MethodsDemo();
		m.m1();
		m.m2(10, 20);
		String result1 = m.m3();
		System.out.println(result1);
		int result2 = m.m4(10, 20);
		System.out.println("with return type,with parameters..." + "sum-" + result2);

	}

	private int m4(int i, int j) {

		return i + j;
	}

	private String m3() {
		return "with return type,without parameters...";
	}

	private void m2(int i, int j) {
		System.out.println("without return type,with parameters..." + "sum-" + (i + j));

	}

	private void m1() {
		System.out.println("without return type,without parameters...");

	}

}
