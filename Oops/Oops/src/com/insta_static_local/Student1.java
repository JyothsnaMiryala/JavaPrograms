package com.insta_static_local;

public class Student1 {
	String name;
	String email;
	long phno;
	static String institute;

	public static void main(String[] args) {

		Student.institute = "vtalent";

		Student st1 = new Student();
		st1.name = "Navya";
		st1.email = "navya@gmail.com";
		st1.phno = 881521654l;
         System.out.println(st1.name+"...."+st1.email+"...."+st1.phno);
         
         
		Student st2= new Student();
		st2.name = "jyo";
		st2.email = "jyo@gmail.com";
		st2.phno = 6305451545l;
        System.out.println(st2.name+"...."+st2.email+"...."+st2.phno);

}
}
