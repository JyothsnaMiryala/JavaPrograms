package com.encapsulation;

public class Test {

	public static void main(String[] args) {
		    Test t = new Test();
            Employee employee=t.employeedetails();
            System.out.println(employee);
	}

 Employee employeedetails() {
		Employee emp = new Employee();
		emp.setEmployeeName("Navya");
		emp.setEmployeeId("45154");
		emp.setEmployeeSalary(13500.0);
		emp.setEmployeeCompany("Qconneqt");
		return emp;
		
	}

}
