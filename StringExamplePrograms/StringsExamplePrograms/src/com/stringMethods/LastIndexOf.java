package com.stringMethods;

public class LastIndexOf {

	public static void main(String[] args) {
		String s ="Amulya";
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.lastIndexOf('b'));//given char is not available
        
		System.out.println(s.lastIndexOf('a',5));
	}
}

