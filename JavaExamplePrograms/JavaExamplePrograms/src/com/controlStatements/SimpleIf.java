package com.controlStatements;
import java.util.*;
public class SimpleIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a:");
        int a =sc.nextInt();
        System.out.println("Enter value of b:");
        int b =sc.nextInt();
        if(a>b) { //a<b
        	System.out.println("HI");
        	System.out.println("Iam belongs to if");
        }
        System.out.println("Iam not belongs to if");
	}

}
