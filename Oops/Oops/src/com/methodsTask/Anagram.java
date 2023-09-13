package com.methodsTask;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
            
		String str1 ="Navya";
		String str2= "navya";
		
		boolean result1=isAnagram(str1,str2);
		if(result1==true) {
			System.out.println("isAnagram");
		}
		else {
			System.out.println("Not Anagram");
		}
	}

	public static boolean isAnagram(String str1, String str2) {
		
		if(str1.length()!=str1.length()) {
			return false;
		}
		else {
		char[] ch1 = str1.toLowerCase().toCharArray();
		char[] ch2 = str2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		 if(Arrays.equals(ch1, ch2)) {
			 return true;
		 }
		}
		return false;
		
		
		
		
	}

}
