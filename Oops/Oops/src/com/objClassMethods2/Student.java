package com.objClassMethods2;

import java.util.Objects;

public class Student {
	int id;
	String name;

	@Override
	public String toString() {
		id: return "Student id-" + id + "..." + "Student name-" + name;

	}

	@Override
	public int hashCode() {
		return id;
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.id = 101;
		s.name = "Navya";

		System.out.println(s);// Internally calling to String
		System.out.println(s.toString());

		String s1 = new String("Hi");
		System.out.println(s1);

		System.out.println("Obj Class hascode-" + s.hashCode());

	}

}
