package com.listInterfacePrograms;
import java.util.*;
public class ListDemo1 {

	public static void main(String[] args) {
		List<String> al= new ArrayList<>();
		al.add("Navya");
		al.add("Jyo");
		al.add(1, "Srilatha");
		
		System.out.println("Initial ArrayList"+al);
		al.set(1, "Jyothsna");
		System.out.println("Updated ArrayList"+al);

		 
		String first=al.get(0);
		String second=al.get(1);
		String third =al.get(2);
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(al);

	boolean	isPresent1=al.contains("Navya");
	System.out.println("Is Navya present in the list?"+"--"+isPresent1);
	boolean	isPresent2=al.contains("Sri");
	System.out.println("Is Sri present in the list?"+"--"+isPresent2);
	}

}
