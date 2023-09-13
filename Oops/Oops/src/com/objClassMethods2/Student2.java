package com.objClassMethods2;

public class Student2 implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student2 s = new Student2();
		System.out.println(s);
		
		Object clone=s.clone();
		System.out.println(clone);

	}

}
