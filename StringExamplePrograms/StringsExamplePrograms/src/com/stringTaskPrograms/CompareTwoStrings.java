package com.stringTaskPrograms;

public class CompareTwoStrings {

	public static void main(String[] args) {
		String s1 = "Navya";
		String s2 ="Manasa";
		String s3 ="Navya";
		String s4="navya";
		String s5=new String("Navya");
		System.out.println(s1==s2);
		System.out.println(s1==s5);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s5));

		
		System.out.println(s1==s3); 
		System.out.println(s1.equals(s3));
		
		
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s4));
		


	}

}
