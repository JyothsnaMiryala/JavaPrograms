package com.taskPrograms;

public class CustomException {

	public static void main(String[] args) {
		try {
		throw new SimpleCustomException("User-defined Exception");
		}
		catch(SimpleCustomException ex) {
			System.out.println(ex);
			System.out.println(ex.getMessage());
		}
		
	}

}
