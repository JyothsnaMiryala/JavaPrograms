package com.operators;

public class PostIncrementDemo {

	public static void main(String[] args) {
           int a =5;
           System.out.println(a++);
           int b =a++ + a++ +a++ +a++;
           System.out.println(b);
	}

}
