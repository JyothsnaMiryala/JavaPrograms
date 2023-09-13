package com.threadPriorityDemo;

public class Demo {

	public static void main(String[] args) {
		ThreadDemo td = new ThreadDemo();
		Thread t1 = new Thread(td);
		t1.setPriority(Thread.MAX_PRIORITY);//10
		t1.setName("Thread-1");
		
		Thread t2 = new Thread(td);
		t2.setPriority(Thread.NORM_PRIORITY);//5
		t2.setName("Thread-2");
		
		Thread t3 = new Thread(td);
		t3.setPriority(Thread.MIN_PRIORITY);//1
		t3.setName("Thread-3");
		
		t1.start();
		//t1.start();
		t2.start();
		t3.start();
		
	}

}
