package com.loopingStatementsPrograms;
import java.io.*;
public class WhileLoopDemo {
     static int start =10;
	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
	    System.out.println("Enter the number:");
		BufferedReader br= new BufferedReader(isr);
		String result=br.readLine();
		int input =Integer.parseInt(result);
		
		while(start>=input) {
			System.out.println(start);
			start--;
		}
		start--;
	}

}
