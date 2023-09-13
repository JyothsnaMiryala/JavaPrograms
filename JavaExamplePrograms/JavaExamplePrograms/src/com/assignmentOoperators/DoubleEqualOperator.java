package com.assignmentOoperators;
import java.util.*;
public class DoubleEqualOperator {

	public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter 'a' number:");
	        int a=sc.nextInt();
	        System.out.println("Enter 'b' number:");
	        int b=sc.nextInt();
	        //a=b;  //assigning a value
	        if(a==b) {  // Comparison
	        	System.out.println("a & b are equal");
	        }
	        else {
	        	System.out.println("a&b are not equal");
	        }

	}

}
