package com.stringTaskPrograms;

public class RemoveWordFromString {
	public static String removeString(String string, String word) {

		if (string.contains(word)) {
			String temp = word + " ";
			string = string.replaceAll(temp, "");
		}
		return string;
	}

	public static void main(String[] args) {

		String str = "Welcome to Union Bank Of India";
		String word = "Union";
		System.out.println(removeString(str, word));

	}

}
