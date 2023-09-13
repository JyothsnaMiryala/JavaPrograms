package com.methods_object;

public class Doctor {
	String name;
	int age;
}
class Driver5 {

	void print(Doctor d) {
		System.out.println(d.name + " " + d.age);
	}

	public static void main(String[] args) {
		Driver5 d5 = new Driver5();

		Doctor d1 = new Doctor();
		d1.name = "Ramulu";
		d1.age = 50;
		d5.print(d1);
	}
}