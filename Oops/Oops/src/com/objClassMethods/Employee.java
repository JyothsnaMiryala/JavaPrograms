package com.objClassMethods;

import java.util.Objects;

public class Employee {
	int id;
	String name;
	String place;

	public Employee(int id, String name, String place) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", place=" + place + "]";
	}

	@Override
	public int hashCode() {
		return 101;
	}

}
