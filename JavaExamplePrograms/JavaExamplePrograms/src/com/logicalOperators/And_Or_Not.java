package com.logicalOperators;
import java.util.*;
public class And_Or_Not {

	public static void main(String[] args){
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();
		/*if(a==b&&a>=0) {
			System.out.println("The condition is satisfied");
		}
		else {
			System.out.println("The condition is not satisfied");
		}*/
		if(a==b||a>=0) {
			System.out.println("The condition is satisfied");
		}
		else {
			System.out.println("The condition is not satisfied");
		}
	}
}
