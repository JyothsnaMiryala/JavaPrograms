package com.stringMethods;

public class StartWithDemo {

	public static void main(String[] args) {
		
		String s= "UnionBankOfIndia";
		boolean str=s.startsWith("Union");
		System.out.println(str);
		
		boolean str1=s.startsWith("navya");
		System.out.println(str1);
		
		boolean str2=s.startsWith("U");
		System.out.println(str2);
	}
}
