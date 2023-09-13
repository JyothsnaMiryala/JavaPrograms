package com.stringTaskPrograms;

public class PrintMiddleChar {
	public static void printMiddleCharacter(String str) {
		
		int length=str.length();
		int middleChar=length/2;
		System.out.println(str.charAt(middleChar));
	}

	public static void main(String[] args) {
		
		String str ="Navya";
		printMiddleCharacter(str);
	}

}
