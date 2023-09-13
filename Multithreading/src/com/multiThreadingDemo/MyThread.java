package com.multiThreadingDemo;

public class MyThread extends Thread{
	public void start() {
		super.start();
		System.out.println("start method");
	}
	public void run() {
		System.out.println("run method");
	}
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
	/*Thread t = new Thread(mt);
		t.start();*/
		System.out.println("main method");
	   //main method and start method executed by main Thread no new Thread will be created

	}

}
