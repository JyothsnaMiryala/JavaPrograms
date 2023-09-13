package com.methods;

public class EligibleForVote1 {

	static int age = 18;

	public static void main(String[] args) {
		EligibleForVote1.check(age);

	}

	public static void check(int age) {
		if (age >= 18) {
			System.out.println("Eligible");
		} else {
			System.out.println("Not-eligible");
		}
	}

}
