package com.methods;

public class ReturnDemo {

	public static void main(String[] args) {
		System.out.println("main() called");
		ReturnDemo r =new ReturnDemo();
		String result=r.m1();
		System.out.println(result);

	}

	private String m1() {
		System.out.println("m1() called");
		m2();
		return "task completed";
	}

	private void m2() {
		System.out.println("m2() called");
		
		
	}

}
