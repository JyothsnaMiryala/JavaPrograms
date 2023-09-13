package com.insta_static_localVar;

public class Demo {
	int i;
	static int j;

	public static void main(String[] args) {
		int a = 10;
		Demo d = new Demo();
		System.out.println(d.i);
		System.out.println(Demo.j);
		System.out.println(a);

	}

}
