package com.methods;

public class EligibleForVote {
	static int age = 35;

	public static void main(String[] args) {
		
		boolean result = EligibleForVote.check(age);
		System.out.println(result);

	}

	private static boolean check(int age) {

		return age >= 18;
		

	}

}
