package com.stringMethods;

public class InternMethod {

	public static void main(String[] args) {
		String str1 ="Shiva";
		String str2 =str1.intern();
		System.out.println(str1==str2);
		String str3=str1;
		System.out.println(str1==str3);
		

	}

}
