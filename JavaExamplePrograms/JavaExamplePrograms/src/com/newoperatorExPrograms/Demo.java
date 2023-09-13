package com.newoperatorExPrograms;
import java.util.*;
public class Demo {
	        int a;
            int b;
         public Demo(int a, int b) {
     		
     		this.a = a;
     		this.b = b;
     	}

         
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Value:");
		int a =sc.nextInt();
		System.out.println("Enter b value:");
		int b= sc.nextInt();
        Demo d = new Demo(a,b);
        System.out.println("The sum is:"+(a+b));
        
        
	}
	
}
