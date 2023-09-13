package com.methodsTask;

import java.util.Arrays;

public class ArrayToString {

	public static void main(String[] args) {
		String[] str = { "1", "2", "3", "4", "5" };

		convertarrayToString(str);
	}

	private static void convertarrayToString(String[] str) {
		System.out.println(Arrays.toString(str));

	}

}
