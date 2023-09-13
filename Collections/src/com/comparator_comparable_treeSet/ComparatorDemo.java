/*Write a program to insert integer Objects 
into the TreeSet where the sorting order is descending order*/

package com.comparator_comparable_treeSet;

import java.util.*;

public class ComparatorDemo {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);    
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}

}
// If we are not passing Comparator Object then JVM will call compareTo()--->meant for default natural sorting order
//output-[0,5,10,15,20]