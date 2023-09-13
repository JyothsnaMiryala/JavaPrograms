// Java Program to Iterate Over the Characters of a String
// Using String.split() method
package com.stringTaskPrograms;

public class IterateCharFromString2 {

	public static void traverseString(String str) {
		String[] stringArray = str.split("");
		for(String ch:stringArray) {
			System.out.print(ch+" ");
		}
	}
	public static void main(String[] args) {
	
		 String str ="JAVATECH";
		 traverseString(str);

	}

}
