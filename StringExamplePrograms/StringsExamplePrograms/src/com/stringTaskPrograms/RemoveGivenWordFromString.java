package com.stringTaskPrograms;

public class RemoveGivenWordFromString {

	public static void main(String[] args) {
		
String str ="My name is abc Navya Thati";
		//String word ="abc";
		str =str.replaceAll("abc","");
		str=str.trim();
		System.out.println(str);
		
		

	}

}
