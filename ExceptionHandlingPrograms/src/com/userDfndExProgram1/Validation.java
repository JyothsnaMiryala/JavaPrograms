package com.userDfndExProgram1;

import java.util.Scanner;

public class Validation {
	public void validate(String username, int password) {
		try {
			if (username.equals("NAVYATHATI521") && password == 4569) {
				System.out.println("wait a moment...Login page is loading...");
			} else {
				throw new UserValidationException("Invalid Username or Password");
			}
		} catch (UserValidationException uve) {
			System.out.println(uve.getMessage());
		}

	}

	public static void main(String[] args) {
		Validation v = new Validation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your username");
		String username = sc.nextLine();
		System.out.println("Enter Your Password");
		int password = sc.nextInt();
		v.validate(username, password);
	}

}
