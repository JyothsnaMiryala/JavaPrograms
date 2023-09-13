package com.Task;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo1 {

	public static void main(String[] args) {
		SortedSet<Integer> s = new TreeSet();
		s.add(100);
		s.add(101);
		s.add(104);
		s.add(106);
		s.add(110);
		s.add(115);
		s.add(120);
		System.out.println(s);
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.headSet(106));
		System.out.println(s.tailSet(106));
		System.out.println(s.subSet(101,115));
		System.out.println(s.comparator());

	}

}
