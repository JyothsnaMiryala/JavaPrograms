package com.stringTaskPrograms;

public class ChartoString {

	public static void main(String[] args) {

            //using concatenation
		   char ch ='a';
		   System.out.println(ch);
		   
		   String str =""+ch;  
		   System.out.println("Char To String using Concatenation:"+str);
		   
		   
		   //using toString
		   char c ='b';
		   
		   String s =Character.toString(c);
		   System.out.println("Using toStringMethod:"+s);
		   

	}

}
