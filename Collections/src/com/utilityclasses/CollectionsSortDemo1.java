package com.utilityclasses;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortDemo1 {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("L");
		System.out.println("Before Sorting"+l);
		Collections.sort(l,new MyComparator());
		System.out.println("After Sorting"+l);
	}

}
