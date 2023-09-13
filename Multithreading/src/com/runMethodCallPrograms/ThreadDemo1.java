package com.runMethodCallPrograms;

public class ThreadDemo1 extends Thread{
    public void run() {
    	System.out.println("run method called"+" : "+Thread.currentThread().getName());
    }
}
