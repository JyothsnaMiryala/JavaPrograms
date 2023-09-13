package com.insta_static_local;

public class Student {
	String name;
	String email;
	long phno;
	static String institute;
	public static void main(String[] args) {
	
	     Student.institute="vtalent";
	     Student s1 = new Student();
	     s1.name="Navya";
	     
	     Student s2 =new Student();
	     s2.email ="navya@gmail.com";
	     
	     Student s3 = new Student();
	     s3.phno =6153214542l;
	     
		
	}

}
