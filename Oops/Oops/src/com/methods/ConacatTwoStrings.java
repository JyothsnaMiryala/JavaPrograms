package com.methods;

public class ConacatTwoStrings {

	public static void main(String[] args) {
		String str1 = "Navya";
		String str2 = "Thati";

		String name = conacatNames(str1, str2);
		System.out.println(name);
	}

	private static String conacatNames(String fname, String lname) {

		return fname + lname;

	}

}
