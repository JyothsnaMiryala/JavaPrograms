package com.multiThreadingDemo;

public class MtDemo1 extends Thread{
	
	public void run() {
		System.out.println("run() method called...");
	}
    public static void main(String[] args) {
    	
    	MtDemo1 d = new MtDemo1();
    	Thread t = new Thread(d);
    	t.start();
    	System.out.println("main method");
    	
	}
}
