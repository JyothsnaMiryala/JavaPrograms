package com.listInterfacePrograms;

import java.util.*;

public class ListDemo2 {

	public static void main(String args[]) {

		List<String> al = new ArrayList<>();

		al.add("Navya");
		al.add("Karthika");
        al.add(1, "Josh");

		for (int i = 0; i < al.size(); i++) {

			System.out.print(al.get(i) + " ");
		}

		System.out.println();

		for (String str : al)

			System.out.print(str + " ");
	}
}
