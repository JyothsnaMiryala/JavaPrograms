package com.stringTaskPrograms;

public class String_Sb_Equals {

	public static void main(String[] args) {
		 String s1 = "Navya";
		 String s2 = "Navya";
	    System.out.println(s1.equals(s2));

	    StringBuffer sb1 = new StringBuffer("Navya");
		StringBuffer sb2 = new StringBuffer("Navya");
		System.out.println(sb1.equals(sb2));
		System.out.println((sb1.toString()).equals(sb2.toString()));

	    System.out.println(s1.equals(sb1));
	    System.out.println(s1.equals(sb1.toString()));
	}
}