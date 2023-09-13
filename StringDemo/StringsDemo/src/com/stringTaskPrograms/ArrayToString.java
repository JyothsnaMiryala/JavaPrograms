package com.stringTaskPrograms;

import java.util.Arrays;

public class ArrayToString{

	public static void main(String[] args){

	    	boolean[] boolArr = { true, false, false, true };
	        char[] charArr =  { 'N', 'a', 'v', 'y', 'a' };
	        double[] dblArr = { 5, 6, 9, 11 };
	        int[] intArr = { 5, 6, 9, 11 };
	        Object[] objArr = { 5, 6, 9, 11 };
	 		System.out.println("Boolean Array: " + Arrays.toString(boolArr));
			System.out.println("Character Array: " + Arrays.toString(charArr));
			System.out.println("Double Array: " + Arrays.toString(dblArr));
			System.out.println("Integer Array: " + Arrays.toString(intArr));
			System.out.println("Object Array: " + Arrays.toString(objArr));
}
}
