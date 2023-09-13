package com.implementsRunnable;

public class Test1 {

	public static void main(String[] args) {
		ThreadDemo1 td = new ThreadDemo1();

		Thread t = new Thread(td);
		t.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println(i + " : " + Thread.currentThread().getName());
		}

	}

}
