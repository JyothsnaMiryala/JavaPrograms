package com.throwsPrograms;

public class Employee {

	public String getName(int id) throws Exception {
		if (id == 100) {
			return "Navya";
		} else if (id == 101) {
			return "Jyothsna";
		} else {
			throw new Exception("Invalid Id");
		}

	}

	public static void main(String[] args) throws Exception {
		Employee e = new Employee();
		String name1 = e.getName(101);
		System.out.println(name1);

		String name2 = e.getName(200);
		System.out.println(name2);
	}

}
