package com.exceptiontask1;

public class InvlaidAgeExcpetion extends Exception {

	private String s;

	public InvlaidAgeExcpetion(String s) {
		this.s=s;
	}

	@Override
	public String toString() {
		return s;
	}

}
