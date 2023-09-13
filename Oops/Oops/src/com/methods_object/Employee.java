package com.methods_object;

public class Employee {
	int id;
	double salary;

}
class Driver3{
	public static void main(String[] args) {
		Driver3 d3 = new Driver3();
		Employee e = new Employee();
		e.id=101;
		e.salary=15000.00;
		d3.print(e);
	}

	public void print(Employee e) {
	  System.out.println("id-"+e.id+"..."+"salary-"+e.salary);
		
	}
}