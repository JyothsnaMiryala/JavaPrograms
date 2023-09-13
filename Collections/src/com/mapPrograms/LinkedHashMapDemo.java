package com.mapPrograms;

import java.util.*;
import java.util.Map.Entry;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> m = new LinkedHashMap<>();
		m.put("Navya", 500);
		m.put("Srilatha", 200);
		m.put("Karthika", 700);
		m.put("Nanditha", 300);
		System.out.println(m);
		Set<String> keySet = m.keySet();
		System.out.println(keySet);
		Collection<Integer> values = m.values();
		System.out.println(values);
		Set<Entry<String, Integer>> entrySet = m.entrySet();
		System.out.println(entrySet);
		Iterator<Entry<String, Integer>> itr = entrySet.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() + "...." + m1.getValue());
			if (m1.getKey().equals("Srilatha")) {
				m1.setValue(600);
			}
		}
		System.out.println(m);
	}
}
