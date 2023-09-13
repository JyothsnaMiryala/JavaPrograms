package com.methodsTask;

public class StringDemo {
	public static void main(String[] args) {
		String str = new String("Navya");
		String str1 = new String("Navya");

		String str2 = "Navya";
		String str3 = "Navya";

		BooleanHashcode(str, str1, str2, str3);

	}

	public static void BooleanHashcode(String str, String str1, String str2, String str3) {

		System.out.println(str.hashCode() == str1.hashCode());
		System.out.println(str2.hashCode() == str3.hashCode());

	}

}
