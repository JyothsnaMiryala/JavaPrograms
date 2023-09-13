package com.multiThreadingDemo;

public class ExtendingThread extends Thread  {
	public void run() {
		System.out.println("run() method");
	}
public static void main(String[] args) {
	ExtendingThread t1 = new ExtendingThread();
	t1.start();
	ExtendingThread t2 = new ExtendingThread();
	t2.start();
	ExtendingThread t3 = new ExtendingThread();
	t3.start();
	System.out.println("main method");
}
}
