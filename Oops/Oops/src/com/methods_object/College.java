package com.methods_object;

public class College {
	int id;
	String name;
}

class Driver7 {

	College m1() {

		College c = new College();
		c.id = 101;
		c.name = "HITM";

		return c;
	}

	public static void main(String[] args) {
		Driver7 d = new Driver7();
		College c = d.m1();
		System.out.println(c.id + "--" + c.name);
	}

}