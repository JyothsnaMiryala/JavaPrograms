package com.Task;

import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet h = new LinkedHashSet();
		h.add("B");
		h.add("c");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add("B"); // duplicates are not allowed
		System.out.println(h.add("Z"));
		System.out.println(h);

	}

}
