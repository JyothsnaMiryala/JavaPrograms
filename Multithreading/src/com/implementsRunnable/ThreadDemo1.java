package com.implementsRunnable;

public class ThreadDemo1 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i+" : "+Thread.currentThread().getName());
		}
		
	}

}
