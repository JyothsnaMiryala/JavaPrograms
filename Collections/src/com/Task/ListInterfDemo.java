package com.Task;

import java.util.ArrayList;
import java.util.List;

public class ListInterfDemo {
   
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Navya");
		al.add("Manasa");
		al.add("Amulya");
		al.add("Navya");
		al.add("Srija");
		System.out.println(al);
		
		al.add(4, "Sirisha");
		System.out.println(al);
		
		List<String> al1 = new ArrayList<String>();
		al1.add("Srilatha");
		al1.add("Jyothsna");
		
		al.addAll(0, al1);
		System.out.println(al);
		
		al.remove(5);
		System.out.println(al);
		al.set(6, "Kavya");
		
		System.out.println(al);
		
		
		System.out.println(al.indexOf("Amulya"));
		al.add(4,"Navya");
		System.out.println(al);
		System.out.println(al.lastIndexOf("Navya"));
		
		

		
	}
	
}
