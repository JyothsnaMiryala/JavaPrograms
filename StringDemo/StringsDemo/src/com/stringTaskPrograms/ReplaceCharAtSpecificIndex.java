package com.stringTaskPrograms;

public class ReplaceCharAtSpecificIndex {

	public static void main(String[] args) {

		String str = "Wecome";

		int index = 2;

		char ch = 'l';

		System.out.println("Original String = " + str);

		str = str.substring(0, index) + ch + str.substring(index + 1);  //we+l+come

		System.out.println("Modified String = " + str);
	}

}
