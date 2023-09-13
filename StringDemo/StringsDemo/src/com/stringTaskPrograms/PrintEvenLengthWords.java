package com.stringTaskPrograms;

public class PrintEvenLengthWords {
	public static void printWords(String s) {
		for (String word : s.split(" ")) {
			if (word.length() % 2 == 0) {
				System.out.println(word);
			}
		}

	}
	public static void main(String[] args) {

		String str = "My Name is Navya";
		printWords(str);

	}

}
