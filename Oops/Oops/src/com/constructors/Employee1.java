package com.constructors;

class Employee1 {

	String name;
	float salary;

	public Employee1(String name, float salary) {
		this.name = name;
		this.salary = salary;
		System.out.println("Employeename-"+this.name + "--" + "EmployeeSalary-"+this.salary);
	}

	public static void main(String[] args) {
		Employee1 emp = new Employee1("Navya", 25000.00f);
	}

}
