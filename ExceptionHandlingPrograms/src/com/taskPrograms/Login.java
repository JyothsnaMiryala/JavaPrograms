package com.taskPrograms;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		String id = sc.nextLine();
		System.out.println("Enter password");
		String password = sc.nextLine();
		try {
			if (id.equals("user1") && password.equals("1234")) {
				System.out.println("wait for login...");
			}

			else {
				throw new InvalidCredentialsException("no such user with username - " + id);
			}

		} catch (InvalidCredentialsException ice) {

			System.out.println(ice.getMessage());

		}
	}
}
