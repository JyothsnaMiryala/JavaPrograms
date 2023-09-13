package com.stringTaskPrograms;

public class IterateCharFromString1 {
public static void traverseString(String str) {
	
	char[] charArray = str.toCharArray();
	for(int i=0;i<charArray.length;i++) {
		System.out.print(charArray[i]+" ");
	}
}
	public static void main(String[] args) {
		
		String str ="NAVYA";
		traverseString(str);
		

	}

}
