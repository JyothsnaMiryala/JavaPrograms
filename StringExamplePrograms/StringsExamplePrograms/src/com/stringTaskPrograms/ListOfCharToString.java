package com.stringTaskPrograms;

import java.util.*;;

public class ListOfCharToString {

	public static void main(String[] args) {

		List<Character> l = Arrays.asList('N','a','v','y','a');

		System.out.println("List: " + l);

		StringBuilder sb = new StringBuilder();//mutable

		for (Character ch : l) {
			sb.append(ch);
		}

		String string = sb.toString();

		System.out.println("String:" + string);
	}

}
