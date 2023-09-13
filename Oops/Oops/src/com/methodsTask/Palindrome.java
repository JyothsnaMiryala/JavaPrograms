package com.methodsTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
	public static void main(String[] args) throws Exception {
		  isPalindrome();
		}

	public static void isPalindrome() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		   BufferedReader br  = new BufferedReader(isr);
		   System.out.println("Enter a String");
		   String originalString = br.readLine();
		   int length  = originalString.length();
		 
		   String reverse ="";
		   for(int i=length-1;i>=0;i--) {
			   reverse=reverse+originalString.charAt(i);
			  
		   }
		   if(originalString.equals(reverse)) {
			   System.out.println("Entered String is a palindrome");
		   }
		   else {
			   System.out.println("Entered String is not a Palindrome");
		   }
		
	}
}
