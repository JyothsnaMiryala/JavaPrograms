package com.firstproject.MavenProject;

public class DebitCard implements Payment {

	public String pay() {

		return "payment done through DebitCard";
	}
	public DebitCard() {
		System.out.println("Debit Card Constructor called");
	}

}
