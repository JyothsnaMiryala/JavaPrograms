package com.utilityclasses;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSearchDemo {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("M");
		l.add("K");
		l.add("a");
		System.out.println(l);//insertion order
		Collections.sort(l);
		System.out.println(l);
		System.out.println(Collections.binarySearch(l, "Z"));//Successful search
		System.out.println(Collections.binarySearch(l, "J"));//Unsuccessful search returns insertion point

	}

}
