package com.Task;

import java.util.*;

public class CursorsDemo {
	public static void main(String[] args) {

		Vector v = new Vector();
		Enumeration e = v.elements();
		System.out.println(e.getClass().getName());
		Iterator itr = v.iterator();
		System.out.println(itr.getClass().getName());
		ListIterator ltr = v.listIterator();
		System.out.println(ltr.getClass().getName());

	}
}
