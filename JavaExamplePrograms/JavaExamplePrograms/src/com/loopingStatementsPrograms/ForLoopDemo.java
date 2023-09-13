package com.loopingStatementsPrograms;
import java.io.*;
public class ForLoopDemo {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the number:");
         String s = br.readLine();
         int num = Integer.parseInt(s);
		for(int i=1;i<=num;i++) {
			System.out.println(i);
		}
	}

}

