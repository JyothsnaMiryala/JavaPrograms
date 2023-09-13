package com.methods;

public class MaxDemo {

	public static void main(String[] args) {
		MaxDemo m = new MaxDemo();

		int arr[] = { 55, 100, 66, 77, 44 };
		int maxElement = m.findMaxElement(arr);

		System.out.println("max element is " + maxElement);
	}

	int findMaxElement(int[] arr) {
		int maxElement = arr[0];
		for (int val : arr) {
			if (val > maxElement) {
				maxElement = val;
			}
		}

		return maxElement;
	}

}
