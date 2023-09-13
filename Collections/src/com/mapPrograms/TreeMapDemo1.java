package com.mapPrograms;

import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {
		TreeMap m = new TreeMap(new MyComparator());
		m.put("XXX",10);
		m.put("AAA", 20);
		m.put("ZZZ", 30);
		m.put("LLL", 40);
		m.put("FFF", "XXX");
	//m.put(null, "XXX");
		System.out.println(m);

	}

}
