package com.extendingThread;

public class OverridingstartMethod {

	public static void main(String[] args) {
		MyThread3 t = new MyThread3();
		t.start();
		System.out.println("main() method");

	}

}
