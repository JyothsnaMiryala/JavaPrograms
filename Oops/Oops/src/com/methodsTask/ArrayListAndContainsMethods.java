package com.methodsTask;
import java.util.*;
public class ArrayListAndContainsMethods {
	public static void main(String[] args) {
	     String str = "JyothsnaMiryala";
	     str = str.toLowerCase();
	     System.out.println(ArrayListAndContainsMethods(str, str ));	
	}
	
	private static int ArrayListAndContainsMethods(String str, String str2) {
	     int count = 0;
	     String vow = "aeiou";
	     ArrayList<Character>vowels = new ArrayList<Character>();
	     for(int i=0;i<vow.length();i++)
	     {
	    	 vowels.add(vow.charAt(i));
	     }
	   System.out.println("Total no of vowels in string are: ");
	     for(int i=0;i<str.length();i++) {
	    	 if(vowels.contains(str.charAt(i))) {
	    		 count++;
	    	 }
	    	
	     }
	   
		return count ;
		
	
	
	}

}