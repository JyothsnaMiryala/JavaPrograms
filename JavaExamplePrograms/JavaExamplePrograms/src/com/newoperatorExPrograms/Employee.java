package com.newoperatorExPrograms;

public class Employee {
       String name;
       int empId;
       public Employee(String name, int empId) {
   		
   		this.name = name;
   		this.empId = empId;
   	}

	public static void main(String[] args) {
		
		Employee e = new Employee("Navya",25116);
		System.out.println("Employee details:"+"EmployeeName:"+e.name+","+"EmployeeId:"+e.empId);

	}
	
}
