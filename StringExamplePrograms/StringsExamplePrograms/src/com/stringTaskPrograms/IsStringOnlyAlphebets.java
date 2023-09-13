package com.stringTaskPrograms;

public class IsStringOnlyAlphebets {

	public static boolean isStringOnlyAlphabet(String str) {

		return ((str != null) && (!str.equals("")) && (str.matches("^[a-zA-Z]*$")));
	}

	public static void main(String[] args) {

		String str1 = "Welcome";
		System.out.println("Input: " + str1);

		System.out.println("Output: " + isStringOnlyAlphabet(str1));

	}
}
