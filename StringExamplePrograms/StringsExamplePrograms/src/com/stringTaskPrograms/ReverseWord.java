package com.stringTaskPrograms;

public class ReverseWord {

	public static void main(String[] args) {
		String str ="NAVYA";
		String string ="";
		System.out.println("Original Word:"+str);
		System.out.println("Reversed Word:");
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			string =ch+string;    //ayva"n"
			
		}
		System.out.println("Reversed Word:"+string);

	}

}
