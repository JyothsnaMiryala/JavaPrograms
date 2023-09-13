package com.implementsRunnable;

public class Test2 {

	public static void main(String[] args) {
		ThreadDemo2 td = new ThreadDemo2();
		Thread t = new Thread(td);
		t.start();
		System.out.println("main method");

	}

}
