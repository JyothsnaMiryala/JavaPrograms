package com.loopingStatementsPrograms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Even_Odd {
	
	 public static void main(String[] args) throws IOException {
		 int i=1;
		 InputStreamReader isr = new InputStreamReader(System.in);
		    System.out.println("Enter the number:");
			BufferedReader br= new BufferedReader(isr);
			String result=br.readLine();
			int num =Integer.parseInt(result);
			
			while(i<=num) {
				if(i%2==0) {
					System.out.println(i+" "+"is a even number");
				}
				else {
					System.out.println(i+" "+"is a odd number");
				}
				i++;
			}
	}

}
