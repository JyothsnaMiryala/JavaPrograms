package com.object;

public class Driver {

	public static void main(String[] args) {
		
		
		Student s = new Student();
		System.out.println("default values");
		System.out.println(s.id);
		System.out.println(s.studentName);
		System.out.println("After initializing");
		s.id = 101;
		s.studentName = "navya";
		System.out.println(s.id);
		System.out.println(s.studentName);

	}

}
