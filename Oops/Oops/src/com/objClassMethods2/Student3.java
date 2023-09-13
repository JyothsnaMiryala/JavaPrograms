package com.objClassMethods2;

public class Student3 {
	int id;
	String name;

	public Student3(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {

		Student3 s1 = new Student3(101, "John");
		Student3 s2 = new Student3(101, "John");

		System.out.println(s1.equals(s2)); // true - compares content (overriden)
		System.out.println(s1 == s2); // false - compares address

		String s3 = new String("hi");
		String s4 = new String("hi");

		System.out.println(s3.equals(s4)); // true - compares content of objects

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // s1 == s2
			return true;
		if (obj == null) // s2 == null
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student3 other = (Student3) obj; // typecasting
		if (id != other.id) // s1.id != s2.id
			return false;
		if (name == null) { // s1.name == null
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name)) // !s1.name.equals(s2.name)
			return false;
		return true; // ---> true
	}
}
