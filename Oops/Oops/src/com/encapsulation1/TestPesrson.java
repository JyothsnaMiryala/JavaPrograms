package com.encapsulation1;

public class TestPesrson {
	public static void main(String[] args) {
		TestPesrson d = new TestPesrson();
		Person person = d.m1();
		System.out.println(person);
	}

	Person m1() {
		Person p = new Person();
		p.setId(101);
		p.setName("Shiva");
		p.setAge(34);
		return p;

	}
}
