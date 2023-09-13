package com.runMethodCallPrograms;

public class ThreadDemo2 implements Runnable{

	@Override
	public void run() {
		System.out.println("run() method started");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("run() method ended");
	}

}
