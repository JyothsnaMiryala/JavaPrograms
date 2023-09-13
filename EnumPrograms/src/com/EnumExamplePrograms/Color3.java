package com.EnumExamplePrograms;

public enum Color3 {
	RED, GREEN, YELLOW;

}

class Demo2 {
	public static void main(String[] args) {
		Color arr[] = Color.values();
		for (Color col : arr) {
			System.out.println(col + "-" + "at index" + "=" + col.ordinal());
		}
		System.out.println(Color.valueOf("RED"));// Using valueOf(). Returns an object ofColor with given constant.
	}
}
