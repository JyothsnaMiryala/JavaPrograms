package com.multiThreadingExample;

public class ThreadDemo {
	public static void main(String[] args) {
		Test test = new Test();
		Thread t = new Thread(test);
		t.start();
		for(int i=1;i<=10;i++) {
			System.out.println("main Thread Executed-"+Thread.currentThread().getName());
		}
	}
	
}
