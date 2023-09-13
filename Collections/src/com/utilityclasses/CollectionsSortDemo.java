package com.utilityclasses;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortDemo {
public static void main(String[] args) {
	ArrayList l = new ArrayList();
	l.add("Z");
	l.add("A");
	l.add("K");
	l.add("N");
	System.out.println(l);
	//l.add(new Integer(10));
	//l.add(null);
	System.out.println("Before Sorting"+l);
	Collections.sort(l);
	System.out.println("After Sorting"+l);
}
}
