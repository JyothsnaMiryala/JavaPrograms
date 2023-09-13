package com.stringDemo;

public class StringLiteral {

	public static void main(String[] args) {
		String s1 = "Navya";
		String s2= "Shiva";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode()==s2.hashCode());
		
		String s3 ="Navya";
		 s3="Karthika";
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1.hashCode()==s3.hashCode());
	}

}
