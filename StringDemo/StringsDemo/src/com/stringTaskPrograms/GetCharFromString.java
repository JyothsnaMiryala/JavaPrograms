package com.stringTaskPrograms;

public class GetCharFromString {

	static char getCharFromString(String str, int index) {
		return str.charAt(index);
	}

	public static void main(String[] args) {

		String str = "GoodMorning";

		int index = 4;

		char ch = getCharFromString(str, index);

		System.out.println("Character from " + str + " at index " + index + " is " + ch);
	}

}
