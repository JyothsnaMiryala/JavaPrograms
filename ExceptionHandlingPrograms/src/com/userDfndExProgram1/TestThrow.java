package com.userDfndExProgram1;

public class TestThrow {

	public static void main(String[] args) {
		try {
		throw new UserDefinedException("This is User-defined exception");
		}
		catch(UserDefinedException ude) {
			System.out.println("Caught the exception");
			System.out.println(ude.getMessage());
		}
	} 

}
