package com.encapsulation1;

public class TestEmployee {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("Navyathati");
		emp.setCompany("Qconneqt");
		emp.setSalary(13500.0);

		System.out.println("id:" + emp.getId());
		System.out.println("Name:" + emp.getName());
		System.out.println("Company:" + emp.getCompany());
		System.out.println("Salary:" + emp.getSalary());
	}

}
