package com.utilityclasses;

import java.util.Arrays;

public class ArraysSortDemo {

	public static void main(String[] args) {
		int [] arr = {10,5,20,11,6};
		System.out.println("Primitive Array Before Sorting:");
		for(int arr1:arr) {
			System.out.println(arr1);
		}
		Arrays.sort(arr);
		System.out.println("Primitive Array After Sorting:");
		for(int arr2:arr) {
			System.out.println(arr2);
		}
		
		String[] s= {"A","Z","B"};
		System.out.println("Object Array Before Sorting:");
		for(String s1:s) {
			System.out.println(s1);
		}
		Arrays.sort(s);
		System.out.println("Object Array After Sorting:");
		for(String s2:s) {
			System.out.println(s2);
		}
		Arrays.sort(s,new MyComparator());
		System.out.println("Object Array After Sorting by Comparator:");
		for(String s3:s) {
			System.out.println(s3);
		}
	}

}
