package com.objClassMethods2;

import java.util.Objects;

public class Student1 {
	int id;
	String name;

	public static void main(String[] args) {

		String str1 = new String("Navya");
		String str2 = new String("Navya");

		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);

		Student1 s1 = new Student1(101, "Navya");
		Student1 s2 = new Student1(101, "Navya");

		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
