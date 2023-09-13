package com.operators;

public class PostPreIncrementDemo {

	public static void main(String[] args) {

		int a =5;
		int b = ++a +a++ + a++ + ++a; //6+6+7+9 =28
		System.out.println(b);
	}

}
