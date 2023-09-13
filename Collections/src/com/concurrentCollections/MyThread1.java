package com.concurrentCollections;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MyThread1 extends Thread {
	static ConcurrentHashMap m = new ConcurrentHashMap();

	public void run() {
		try {
			Thread.sleep(2000);

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		System.out.println("Child Thread Updating Map");
		m.put(103, "C");
	}

	public static void main(String[] args) throws Exception {
		m.put(101, "A");
		m.put(102, "B");

		MyThread1 mt = new MyThread1();

		mt.start();
		Set s = m.keySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			System.out.println("Main Thread Iterating List and current entry is " + i + "...." + m.get(i));
			Thread.sleep(3000);

		}
		System.out.println(m);

	}

}
