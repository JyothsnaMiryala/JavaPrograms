package com.Task;

public class ComparableDemo {

	public static void main(String[] args) {
		System.out.println("A".compareTo("Z"));  // -1
		System.out.println("Z".compareTo("K"));  // +1
		System.out.println("A".compareTo("A"));  //0
		System.out.println("A".compareTo(null));

	}

}
