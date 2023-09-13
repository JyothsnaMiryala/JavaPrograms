package com.userDfndExProgram1;

public class TestThrow1 {

	public static void validate(int age) {
		try {
			if (age < 18) {
				throw new ArithmeticException("Person is not eligible to vote");
			} else {
				System.out.println("Person is eligible for vote");
			}
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		validate(13);
		System.out.println("rest of the code");

	}

}
