package com.stringTaskPrograms;

import java.util.*;

public class ListOFStringtoCommaSeparatedString {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("Navya", "Srilatha", "Jyothsna"));

		System.out.println("List of String: " + list);

		String string = String.join(",", list);

		System.out.println("Comma separated String: " + string);

	}
}