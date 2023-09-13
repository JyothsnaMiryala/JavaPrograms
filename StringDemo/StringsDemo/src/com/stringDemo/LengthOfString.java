package com.stringDemo;

import java.io.*;

class Length {

	public static int length(String string) {
		int i = 0;
		char[] charArray = string.toCharArray();
		for (i = 0; i < charArray[i]; i++) {

		}
		i++;

		return i;
	}
}

public class LengthOfString {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the String:");
		String string = br.readLine();
		System.out.println("Length of The String:" + Length.length(string));

	}
}
