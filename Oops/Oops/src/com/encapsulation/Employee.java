package com.encapsulation;

public class Employee {
	private String employeeName;
	private String employeeId;
	private double employeeSalary;
	private String employeeCompany;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeCompany() {
		return employeeCompany;
	}

	public void setEmployeeCompany(String employeeCompany) {
		this.employeeCompany = employeeCompany;
	}

	

	@Override
	public String toString() {
		return "Employee details [employeeName=" + employeeName + ", employeeId=" + employeeId + ", employeeSalary="
				+ employeeSalary + ", employeeCompany=" + employeeCompany+"]";
	}

	

}
