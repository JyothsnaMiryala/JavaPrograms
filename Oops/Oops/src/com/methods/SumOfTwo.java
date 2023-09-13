package com.methods;

import java.io.*;

public class SumOfTwo {
	private static int add(int input1, int input2) {
		int sum = input1 + input2;

		return sum;

	}

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter input1");
		String str1 = br.readLine();
		int input1 = Integer.parseInt(str1);
		System.out.println("Enter input2");
		String str2 = br.readLine();
		int input2 = Integer.parseInt(str2);

		int sum = add(input1, input2);
		System.out.println(sum);
	}

}
