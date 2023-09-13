package com.stringTaskPrograms;

import java.util.*;

public class SetOfIntegerstoSetOfString {
	public static void main(String[] args) {

		Set<Integer> setOfInteger = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));

		System.out.println("Set of Integer: " + setOfInteger);

		Set<String> setOfString = new HashSet<>();

		for (Integer i : setOfInteger) {
			setOfString.add(i.toString());
		}
		System.out.println("Set of String: " + setOfString);
	}
}