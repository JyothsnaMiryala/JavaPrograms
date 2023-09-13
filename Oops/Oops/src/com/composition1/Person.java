package com.composition1;

public class Person {

	private Job job;

	public Person() {
		this.job = new Job();
		job.setSalary(65000L);
	}

	public long getSalary() {
		return job.getSalary();
	}

}
