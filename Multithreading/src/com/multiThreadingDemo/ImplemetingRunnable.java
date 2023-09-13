package com.multiThreadingDemo;

public class ImplemetingRunnable implements Runnable {

	public void run() {
		System.out.println("run() method");
	}

	public static void main(String[] args) {
		ImplemetingRunnable i = new ImplemetingRunnable();
		Thread t = new Thread(i);
		t.start();
		System.out.println("main method");

	}

}
