package com.threadPriorityDemo;

public class Demo1 {
	public static void main(String[] args) {
		Thread.currentThread().setPriority(10);
		Thread.currentThread().setName("main thread");
		ThreadDemo1 td = new ThreadDemo1();
		Thread t1 = new Thread(td);
		t1.setPriority(10);
		t1.start();

		Thread t2 = new Thread(td);
		t2.setPriority(5);
		t2.start();

		Thread t3 = new Thread(td);
		t3.setPriority(1);
		t3.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("main Thread executed::" + Thread.currentThread().getName());
            System.out.println("Priority-"+Thread.currentThread().getPriority());
            
		}
	}
}
