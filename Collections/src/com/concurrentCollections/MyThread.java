package com.concurrentCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class MyThread extends Thread {
	 static ArrayList al = new ArrayList();

	public void run() {
		try {
			Thread.sleep(3000);

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		System.out.println("Child Thread Updating List");
		al.add("D");
	}

	public static void main(String[] args) throws Exception {
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("E");
		al.add("E");
		al.add("E");
		MyThread mt = new MyThread();
		// Thread t = new Thread(mt);
		mt.start();
		Thread.currentThread().setName("Navya");
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			System.out.println("Main Thread Iterating List and current Object is" + s);
			Thread.sleep(3000);

		}
		System.out.println(al);

	}

}
