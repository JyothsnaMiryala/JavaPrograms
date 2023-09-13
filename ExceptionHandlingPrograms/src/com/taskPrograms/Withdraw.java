package com.taskPrograms;

import java.util.Scanner;

public class Withdraw {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Withdraw Amount");
		int withdrawAmount = sc.nextInt();

		try {
			if (withdrawAmount <= 0) {
				throw new AmountLessThanRequiredException("Entered Amount is less than minimum withdrawlimit");
			}
			else {
				System.out.println();
			}

		} catch (AmountLessThanRequiredException ex) {
              System.out.println(ex.getMessage());
		}

	}

}
