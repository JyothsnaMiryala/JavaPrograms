package com.stringTaskPrograms;

public class StringtoStringArray {

	public static void main(String[] args) {
		
		String str ="Java Program";
		System.out.println("String:"+str);
		String[] strArray = str.split("");
		System.out.println("StringArray:");
	 	for(int i=0;i<strArray.length;i++) {
			System.out.print(strArray[i]+" ");
		}

	}

}
