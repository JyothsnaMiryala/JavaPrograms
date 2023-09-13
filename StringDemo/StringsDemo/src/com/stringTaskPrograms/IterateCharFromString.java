// Java Program to Iterate Over the Characters of a String
// Using Naive Approach
 

package com.stringTaskPrograms;

public class IterateCharFromString {
public static void traverseString(String str) {
	for(int i=0;i<str.length();i++) {
		System.out.println(str.charAt(i));
		System.out.println(" ");
	}
	
}
public static void main(String[] args) {
		
		String str ="HiHello";
		traverseString(str);
	}

}
