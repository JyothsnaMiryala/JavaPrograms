package com.namingConventions;

public class Employee {
        String name;
        int empID;
        long phoneNumber;
        double salary;
	
	public Employee(String name, int empID, long phoneNo,double salary) {
		this.name = name;
		this.empID = empID;
		this.phoneNumber = phoneNumber;
		this.salary=salary;
	}

public static void main(String[] args) {
		
		Employee e = new Employee("Navya",46825,8465162555l,25000.0);
		
		System.out.println(e);
	}

@Override
public String toString() {
	return "Employee Details[name=" + name + ", empID=" + empID + ", phoneNumber=" + phoneNumber + ", salary=" + salary + "]";
}




}                  
