package com.programs;
import java.io.*;
public class Factorial {

	public static void main(String[] args) throws Exception {
       InputStreamReader isr = new InputStreamReader(System.in);
       BufferedReader br = new BufferedReader(isr);
       System.out.println("Enter the number:");
       String str = br.readLine();
       int num =Integer.parseInt(str);
       int fact=1;
       for(int i=1;i<=num;i++) {
    	   fact=fact*i;
       }
       System.out.println("The Factorial of"+" "+num+" "+"is:"+fact);

	}

}
