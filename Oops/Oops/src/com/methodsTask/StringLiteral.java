package com.methodsTask;

public class StringLiteral {
	public static void main(String[] args) {
		String s1 = "Navya";
		String s2 = "Shiva";

		String s3 = "Navya";
		s3 = "Karthika";

		check(s1, s2, s3);
	}

	public static void check(String s1, String s2, String s3) {
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() == s2.hashCode());

		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1.hashCode() == s3.hashCode());

	}
}
