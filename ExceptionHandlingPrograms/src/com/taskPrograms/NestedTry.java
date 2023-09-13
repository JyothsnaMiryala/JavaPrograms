package com.taskPrograms;

public class NestedTry {
	public static void main(String[] args) {
		try {
			int[] arr = { 1, 2, 3, 4, 5, 6 };
			System.out.println(arr[6]);
			try {
				int x = arr[4] / 0;
				System.out.println(x);
			} catch (ArithmeticException ae) {
				System.out.println("division by zero is not possible");
			}
		} catch (ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("The element at such index does not exists");
		}
	}

}
