package com.accessModifiers1;

public class ProtectedDemo3 extends ProtectedDemo1 {

	public static void main(String[] args) {
		ProtectedDemo1 p1 = new ProtectedDemo1();
		p1.m1();
		ProtectedDemo3 p2 = new ProtectedDemo3();
		p2.m1();
		ProtectedDemo1 p3 = new ProtectedDemo3();
		p3.m1();

	}

}
