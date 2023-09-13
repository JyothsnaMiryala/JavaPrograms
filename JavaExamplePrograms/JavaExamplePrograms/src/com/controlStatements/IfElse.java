package com.controlStatements;
import java.util.*;
public class IfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number =sc.nextInt();
		if(number>0) {
			System.out.println(number+"is positive number");
		}
		else if(number<0){
			System.out.println(number+"is negative number");
		}
		else {
			System.out.println(number +"is zero");
		}

	}

}
