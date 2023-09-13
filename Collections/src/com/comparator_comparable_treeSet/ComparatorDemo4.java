/*Write a program to insert String and StringBuffer objects into Treeset
 * where Sorting Order is increasing length order.
 * If two objects having same length then consider their alphabetical order  */
package com.comparator_comparable_treeSet;

import java.util.*;

public class ComparatorDemo4 {

	public static void main(String[] args) {
		TreeSet<CharSequence> t = new TreeSet<CharSequence>(new MyComparator4());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		System.out.println(t);

	}

}

