package com.methodsTask;

public class StringConstantPool {
	String s1 = "Navya";
	String s2 = "Navya";

	public static void main(String[] args) {
		StringConstantPool str = new StringConstantPool();
		str.bothSameOrNot();

	}

	public void bothSameOrNot() {
		if (s1 == s2) {
			System.out.println("Both references pointed to same object");
		} else {
			System.out.println("Both references not pointed to same object");
		}
	}
}
