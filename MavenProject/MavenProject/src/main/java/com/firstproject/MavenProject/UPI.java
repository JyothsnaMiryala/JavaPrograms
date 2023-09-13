package com.firstproject.MavenProject;

public class UPI implements Payment {

	public UPI() {
		System.out.println("UPI class Constructor called");
	}

	public String pay() {

		return "payment done through UPI";
	}

}
