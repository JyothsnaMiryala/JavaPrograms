package com.Task;

import java.util.TreeSet;

public class NavigableSetDemo {
	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(1000);
		t.add(2000);
		t.add(3000);
		t.add(4000);
		t.add(5000);
		
		System.out.println(t);
		System.out.println("2000 and After 2000-lowest element"+t.ceiling(2000));
		System.out.println("After 2000-lowest element"+t.higher(2000));
		System.out.println("3000 and Before 3000-highest element "+t.floor(3000));
		System.out.println("before 3000-highest element"+t.lower(3000));
		System.out.println("remove and return first element"+t.pollFirst());
		System.out.println("remove and return last element"+t.pollLast());
		System.out.println(t.descendingSet());
		System.out.println(t);
	}
}
