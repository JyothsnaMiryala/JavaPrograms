package com.methodsTask;

public class HeapArea {

	public static void main(String[] args) {

		String s1 = new String("Navya");
		String s2 = new String("Navya");
		Comparison(s1, s2);

	}

	public static void Comparison(String s1, String s2) {

		if (s1 == s2) {
			System.out.println("Both references pointed to same object");
		} else {
			System.out.println("Both references not pointed to same object");
		}

	}

}
