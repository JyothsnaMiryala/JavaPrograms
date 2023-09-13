package com.stringDemo;

public class Primitive_String {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;

		System.out.println(i == j);
		if (i == j) {
			System.out.println("Both references pointed to same object");
		} else {
			System.out.println("Both references not pointed to same object");
		}

	}

}
