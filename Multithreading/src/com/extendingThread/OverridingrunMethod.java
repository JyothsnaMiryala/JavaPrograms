package com.extendingThread;

public class OverridingrunMethod {
   public static void main(String[] args) {
	   MyThread2 t= new  MyThread2();
	   t.start();
	   System.out.println("main() method");
   }
	
}
