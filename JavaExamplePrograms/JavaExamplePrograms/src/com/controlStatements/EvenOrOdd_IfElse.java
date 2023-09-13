package com.controlStatements;
import java.io.*;
public class EvenOrOdd_IfElse {
	public static void main(String[] args) throws IOException {
	      InputStreamReader isr = new InputStreamReader(System.in);
          BufferedReader br = new 	BufferedReader(isr);
          System.out.println("Enter Number");
          String str = br.readLine();
          int num =Integer.parseInt(str);
          if(num%2==0) {
        	  System.out.println(num+" "+"is even number");
          }
          else {
        	  System.out.println(num+" "+"is odd number");
          }
   	}
}
