package com.stringMethods;

public class DoubleEqual_Equals {

	public static void main(String[] args) {
		String s1 ="Shiva";
		String s2 ="Srilatha";
		String s3="shiva";
		String s4 ="Srilatha";
		System.out.println(s1==s2);
		System.out.println(s1==s3); //case sensitive
		System.out.println(s2==s4);
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4));
		

	}

}
