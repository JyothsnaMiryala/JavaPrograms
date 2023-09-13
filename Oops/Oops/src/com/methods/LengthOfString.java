package com.methods;

public class LengthOfString {

	public static void main(String[] args) {
		String s = "Good Morning";
		 int length=findlength(s);
		System.out.println(length);

	}

	private static int findlength(String s) {
		int length = 0;		
		char[] ch = s.toCharArray();
		for (int i= 0; i < ch.length; i++) {
			length++;	
		}

		return length;
	}
}
