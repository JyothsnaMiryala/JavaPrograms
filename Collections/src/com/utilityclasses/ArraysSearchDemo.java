package com.utilityclasses;

import java.util.Arrays;

public class ArraysSearchDemo {

	public static void main(String[] args) {
		int[] arr = { 10, 5, 20, 11, 6 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, 6));
		System.out.println(Arrays.binarySearch(arr, 4));
		String[] s = { "A", "Z", "B" };
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.binarySearch(s, "Z"));
		System.out.println(Arrays.binarySearch(s, "S"));
		Arrays.sort(s, new MyComparator());
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.binarySearch(s, "Z", new MyComparator()));
		System.out.println(Arrays.binarySearch(s, "S", new MyComparator()));
		System.out.println(Arrays.binarySearch(s, "N"));// unpredictable results

	}

}
