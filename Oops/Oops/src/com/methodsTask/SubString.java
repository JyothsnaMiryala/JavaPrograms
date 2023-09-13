package com.methodsTask;

public class SubString {
	public static void main(String[] args) {
		String s = "Navya";

		GiveSubString(s);

	}

	private static void GiveSubString(String s) {

		String substring = s.substring(0);
		System.out.println(substring);
		String substring2 = s.substring(0, 4);
		System.out.println(substring2);
	}
}
