package com.methods;

public class ReverseString {

	public static void main(String[] args) {
		ReverseString r = new ReverseString();
		String str ="Navya";
		 String reverseString =r.reverseString(str);
		 System.out.println(reverseString);

	}

	private String reverseString(String str) {
		
		String result="";
		for(int i=str.length()-1;i>=0;i--) {
			result =result+str.charAt(i);
		}
		return result;
		
		
	}

}
