package com.loopingStatementsPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
public class EvenOrOdd {
		static int i =0;
	public static void main(String[] args) throws IOException {
	
			InputStreamReader isr = new InputStreamReader(System.in);
		    System.out.println("Enter the number:");
			BufferedReader br= new BufferedReader(isr);
			String result=br.readLine();
			int num =Integer.parseInt(result);
			//System.out.println("Even Numbers are:");
			System.out.println("Odd Numbers are:");
				  while(i<=num) {
				 
				   /* if((i%2)==0) {
					  
				      System.out.println(i);
				      i++;*/
				     if((i%2)==1) {
				      System.out.println(i);
				     i++;
				     }
				     i++;
	             }
			
	}
}


