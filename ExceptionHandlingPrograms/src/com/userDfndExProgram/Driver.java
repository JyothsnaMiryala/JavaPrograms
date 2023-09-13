package com.userDfndExProgram;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id");
		int id = sc.nextInt();
		if (id <= 0) {
			throw new InvalidIdException("Negative numbers won't accept");
		} else {
			System.out.println(id + "-" + "Positive Number");
		}

	}

}
