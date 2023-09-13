package com.stringTaskPrograms;
//using loops
public class IterateCharInString {
	 

	public static void main(String[] args) {
		String str ="IloveJava";
      
		 getChar(str);
     }
    
	static void getChar(String str) {
		    int count=0;
		    System.out.println("Characters In String");
			for(int i=0;i<str.length();i++) {
				
				System.out.print(str.charAt(i));
				count++;
				System.out.println(" ");
			}
		
		System.out.println("NO.ofCharacters:"+count);
	}
}

