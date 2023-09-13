package com.IdentifierPrograms;

public class Test {

	int x=10;
	int y=20;
	//int byte =30;
	
	public void m1() {
		System.out.println("m1() called:");
		System.out.println("The sum is:"+(x+y));

	}
	public void m2() {
		System.out.println("m2() called:");
		System.out.println("The value is:"+(y-x));
	}
	/*public void byte() {
		System.out.println(x*y);
	}*/
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
		t.m2();
		
		
		}
	}


