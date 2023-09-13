package com.stringMethods;

public class ValueOf {

	public static void main(String[] args) {
       int a=10;
       int b=20;
       System.out.println(a+b);  //Arithmetic operation
       
       String s1="10";
       String s2 ="20";
       System.out.println(s1+s2);//concat
       
       String str=String.valueOf(a)+String.valueOf(b);
       System.out.println(str);
       
       
       
	}

}
