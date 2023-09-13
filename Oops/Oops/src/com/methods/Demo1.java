package com.methods;

public class Demo1 {

	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.m1();
	}

	void m1() {
       System.out.println("m1() method");
       m1(1,0.5f);
	}

	void m1(int a, float f) {
          System.out.println(a+f);
          add(10,20);
          add1(10,30);
          
          
          
	}

	int add(int a, int b) {
		int c = a + b;
		System.out.println(c);
		return c;
	}

	int add1(int a, int b) {
		return a + b;
	}

	int div(int a, int b) {
		return a / b;
	}
	String  m1 (String name){

		String s1 = name.toUpperCase( ) ;

		return s1;
	}

}
