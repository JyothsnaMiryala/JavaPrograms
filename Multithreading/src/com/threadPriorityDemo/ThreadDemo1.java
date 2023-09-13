package com.threadPriorityDemo;

public class ThreadDemo1 implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Child Thread Executed::"+Thread.currentThread().getName());
            System.out.println("Priority-"+Thread.currentThread().getPriority());
		}
		
	}

}
