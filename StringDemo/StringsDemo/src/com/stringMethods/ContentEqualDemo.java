package com.stringMethods;

public class ContentEqualDemo {

	public static void main(String[] args) {
		String str1="ILOVEMYINDIA";
		System.out.println(str1.contentEquals("ILOVEMYINDIA"));
		System.out.println(str1.contentEquals("INDIA"));
		
		StringBuffer sb = new StringBuffer("ILOVEMYINDIa");
		System.out.println(str1.contentEquals(sb));
		

	}

}
