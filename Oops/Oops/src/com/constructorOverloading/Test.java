package com.constructorOverloading;

public class Test {
	public Test() {
		System.out.println("no-arg Constructor");
	}

	public Test(int i) {
		System.out.println("int-arg Constructor");
	}
	public Test(double d) {
		System.out.println("double-arg Constructor");
	}

	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test(10);
		Test t3 = new Test(10.5);
		Test t4 = new Test(10l); //next level promotion
		

	}

}
