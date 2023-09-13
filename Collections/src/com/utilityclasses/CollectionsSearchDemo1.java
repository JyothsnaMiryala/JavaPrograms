package com.utilityclasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSearchDemo1 {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(15);
		l.add(0);
		l.add(20);
		l.add(10);
		l.add(5);
		System.out.println(l);//insertion order
		Collections.sort(l,new MyComparator1());
		System.out.println(l);
		System.out.println(Collections.binarySearch(l, 10,new MyComparator1()));
		System.out.println(Collections.binarySearch(l, 13,new MyComparator1()));
		System.out.println(Collections.binarySearch(l, 17));

	}

	
}
