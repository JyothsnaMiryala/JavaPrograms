package com.insta_static_local;

public class LocalVar {

	public static void main(String[] args) {
		LocalVar v = new LocalVar(); // v is local variable
		v.m1(10,20);
	}

	private void m1(int i, int j) { //i ,j local variables
		System.out.println(i+j);
		
	}

}
