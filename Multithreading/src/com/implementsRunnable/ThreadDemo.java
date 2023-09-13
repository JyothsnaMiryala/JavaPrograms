package com.implementsRunnable;

public class ThreadDemo implements Runnable {

	public static void main(String[] args) {
		ThreadDemo td1 = new ThreadDemo();
		Thread t1 = new Thread(td1);
		t1.start();
		ThreadDemo td2 = new ThreadDemo();
		Thread t2 = new Thread(td2);
		t2.start();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("main Thread-"+i+"-"+Thread.currentThread().getName());
		}
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Child Thread-"+i+"-"+Thread.currentThread().getName());
		}

	}

}
//three  threads having same so we will get priority irregular output 
