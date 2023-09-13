package com.loopingStatementsPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoWhileLoop {
  /* static int start =10;
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
	    System.out.println("Enter the number:");
		BufferedReader br= new BufferedReader(isr);
		String result=br.readLine();
		int input =Integer.parseInt(result);
		do {
			System.out.println(start);
			start--;
		}
		while(start>input);{
			System.out.println(start);
			start--;
		}
		start--;
	}*/
	
		public static void main(String... args){
				
				int i = 1;
				do {
					System.out.println(i);
					i++;
				}while (i <= 10);
		}
	}

	


