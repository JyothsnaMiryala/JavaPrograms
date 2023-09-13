package com.stringDemo;

public class StringConstantPool {

	public static void main(String[] args) {
		String s1 = "Navya";
		String s2 ="Navya";
		if(s1==s2) {
			System.out.println("Both references pointed to same object");
		}
		else {
			System.out.println("Both references not pointed to same object");
		}

	}

}
