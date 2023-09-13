package com.normalapproachExPrograms;

interface Interf {
	public void m1();
}

class TestInterfExProgram {
	public static void main(String[] args) {
		Interf i = () -> System.out.println("LambdaExpressions...");
		i.m1();

	}
}
