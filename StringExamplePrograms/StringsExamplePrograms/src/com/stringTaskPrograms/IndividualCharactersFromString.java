package com.stringTaskPrograms;

public class IndividualCharactersFromString {

	public static void main(String[] args) {
		String str ="Welcome";
		System.out.println("Given String:"+str);
		System.out.println("individual characters from given String:");
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i)+" ");
		}
	}

}
