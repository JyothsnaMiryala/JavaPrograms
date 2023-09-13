package com.objClassMethods1;

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
		return Objects.hash(id, name, place);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(place, other.place);
	}

	

}