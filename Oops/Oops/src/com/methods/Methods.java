package com.methods;

import java.util.Arrays;

public class Methods {

	public static void main(String[] args) {

		Methods m = new Methods();

		int[] ar = { 1, 2, 3 };
		m.print(ar);

		m.fullname("Navya","thati");
	}

	void fullname(String fname, String lname) {
		String name = fname + lname;
		System.out.println(name);
	}

	void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}
