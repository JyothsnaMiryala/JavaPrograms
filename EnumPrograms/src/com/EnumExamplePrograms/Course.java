package com.EnumExamplePrograms;

public enum Course {

	JAVA, PYTHON, DEVOPS, AWS, DOCKER, KUBERNETES;

	public static void main(String[] args) throws Exception {

		Course[] values = Course.values();

		for (Course c : values) {
			System.out.println(c);
		}

	}
}
