package com.concurrentCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentCollectionDemo {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("A");
		l.add("B");
		l.add("C");
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			String s=(String)itr.next();
			System.out.println(s);
			l.add("D");	//ConcurrentModificationException
		}

	}

}
