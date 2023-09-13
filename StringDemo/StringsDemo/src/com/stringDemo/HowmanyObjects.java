package com.stringDemo;

public class HowmanyObjects {

	public static void main(String[] args) {
		String s1 ="Navya";
		String s2 ="Navya";
		String s3 = new String("Navya");
		String s4 = new String("Navya");
		String  s5 = new String("Karthika");
		String s6 = new String("Karthika");
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s4);
		System.out.println(s5==s6);

		
	}

}
