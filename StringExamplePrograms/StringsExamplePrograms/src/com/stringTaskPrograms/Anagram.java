package com.stringTaskPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Anagram {
	public static boolean areAnagram(char ch1[], char ch2[]) {
		int length1 = ch1.length;
		int length2 = ch2.length;
		if (length1 != length2) {
			return false;
		}
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		for (int i = 0; i < length1; i++) {
			if (ch1[i] != ch2[i]) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter String-1");
		String s1 = br.readLine();
		char ch1[] = s1.toCharArray();
		System.out.print("Enter String-2");
		String s2 = br.readLine();
		char ch2[] = s2.toCharArray();

		if (areAnagram(ch1, ch2)) {
			System.out.println("The two Strings are anagram of each other");

		} else {
			System.out.println("The two Strings are not anagram of each other");
		}
	}

}
