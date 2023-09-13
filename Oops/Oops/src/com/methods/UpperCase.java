package com.methods;

public class UpperCase {

	public static void main(String[] args) {
		String name = "navya";
		System.out.println(name);

		String name1 = convertUppercase(name);
		System.out.println(name1);

	}

	static String convertUppercase(String name) {

		return name.toUpperCase();

	}

}
