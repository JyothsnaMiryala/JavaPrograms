package com.multiThreadingDemo;

public class Test implements Runnable {
	public static void main(String[] args) {
		Test t = new Test();
		Thread t1 = new Thread(t);
		t1.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println("main Thread-" + i);
		}
	}

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("child Thread-" + i);
		}
	}
}
