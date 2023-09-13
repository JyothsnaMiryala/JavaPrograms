package com.controlStatements;

import java.util.Scanner;

class IfElseDemo {

    public static void main (String... args){	
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
        int age =sc.nextInt();

			if ( age >= 18 ) {
				System.out.println("You are Eligible For Vote") ;
			} else {
				System.out.println("You are not eligible for Vote");
			}
			System.out.println("Bye");
    }
}

