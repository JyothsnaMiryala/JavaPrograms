package com.methodsTask;

public class Strings_New {
	public static void main(String[] args) {
		String s1 = new String("NAVYA");
		String s2 = new String("navya");

		String s3 = new String("navya");

		s3 = "Shiva";

		check(s1, s2, s3);

	}

	private static void check(String s1, String s2, String s3) {
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() == s2.hashCode());

		System.out.println(s2 == s3);
		System.out.println(s2.equals(s3));

		System.out.println(s2.hashCode() == s3.hashCode());

	}

}
