/*Write a program to insert String Objects into the Treeset 
where all the elements should be inserted according to reverse of alphabetical order */
package com.comparator_comparable_treeSet;

import java.util.*;

public class ComparatorDemo2 {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator2());
		t.add("Navya");
		t.add("Srilatha");
		t.add("Nanditha");
		t.add("Jyosthsna");
		t.add("Nandini");
		System.out.println(t);

	}

}
