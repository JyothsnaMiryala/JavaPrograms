/*Write a program to insert StringBuffer objects 
 * into the TreeSet where Sorting order is alphabetical order*/
package com.comparator_comparable_treeSet;
import java.util.*;
public class ComparatorDemo3 {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator3());
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("L"));
		System.out.println(t);
	}

}
