package com.Task;

import java.util.*;

public class SortedSetDemo {

	public static void main(String[] args) {
		SortedSet<String> s = new TreeSet();
		s.add("Navya");
		s.add("Srilatha");
		s.add("Shiva");
		s.add("Nanditha");
		s.add("Prasad");
		s.add("Karthika");
		System.out.println(s);
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.headSet("Shiva"));
		System.out.println(s.tailSet("Nanditha"));
		System.out.println(s.subSet("Karthika","shiva"));
		System.out.println(s.comparator());

	}

}
