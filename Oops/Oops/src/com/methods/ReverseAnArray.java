package com.methods;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] arr = { 15, 8, 9, 2, 11, 4, 7 };
		 reversearray(arr);
	
	}

	private static void reversearray(int[] arr) {


		
		for(int i=arr.length-1;i>=0;i--) {
		  System.out.print(arr[i]+" ");	
		}
		
	
	}

	}
