package com.programs;

public class DifferentMethodsOfString {
	void addition() {
		 String name =" nava ";
		 System.out.println(name);
	}
	public static void main(String[] args) {
		String str= " Navaneetha and My team" ;
		int sum =add(2,4);
		System.out.println(sum);
		System.out.println(str.charAt(10));
		System.out.println(str.trim());
		System.out.println(str.split(""));
		System.out.println("name in small letters " +str.toLowerCase());
		System.out.println("name in capital letters " + str.toUpperCase());
		System.out.println("length of String "  + str.length());
	DifferentMethodsOfString name=new DifferentMethodsOfString();
		         name.addition();
	
	}
	
		public static int add(int a, int b) {
		return a + b;
		}
	}

