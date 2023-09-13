package com.interfaces3;

public class Teacher implements Interf,Exam {

	

	@Override
	public void work() {
		System.out.println("Teaching");
		
	}

	@Override
	public void write() {
		System.out.println("Writing");
		
	}
}
