package com.stringTaskPrograms;

public class WhiteSpaces {

	public static boolean isStringAllWhiteSpace(String str) {

		if (str.trim().isEmpty())
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		String str1 = "GeeksforGeeks";
		String str2 = "                ";

		System.out.println("String [" + str1 + "]" + isStringAllWhiteSpace(str1));
		System.out.println("String [" + str2 + "]"  + isStringAllWhiteSpace(str2));
	}

}
