package com.loopingStatementsPrograms;
import java.io.*;
 public class While_PrimeNumbers {
	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the number");
		String s =br.readLine();
		int value =Integer.parseInt(s);
			int num =1;
		while(num<=value) {
			int temp=0;
			if(num==1) {
				System.out.println(num+"it not a prime");
				num++;
				//continue;
			}
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					temp = temp+1;
				}
			}
			if(temp==0) {
				System.out.println(num+"is prime number");
			}
			else {
				System.out.println(num+"is not a prime number");
				
			}
			num++;
		}

	}

}
