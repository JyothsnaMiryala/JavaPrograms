//Write a java program to print numbers from 1 to 10 using while loop
package com.loopingStatementsPrograms;
import java.io.*;
  public class WhileLoop {
	public static void main(String[] args) throws IOException {
             int i=1;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
          System.out.println("Enter the number:");
        String str = br.readLine();
        int num =Integer.parseInt(str);
        while(i<=num) {
        	System.out.println(i);//1,2,3,4,5
        	i++;//2,3,4,5,6
        }
	}

}
