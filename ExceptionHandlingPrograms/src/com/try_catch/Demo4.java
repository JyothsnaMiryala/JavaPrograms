package com.try_catch;

public class Demo4 {

	public static void main(String[] args) {
		System.out.println("main() method started...");
		try {
			System.out.println("try block started..");
			int i = 10/2;
		}
		catch(Exception e){
			System.out.println("catch block");
			e.printStackTrace();
		}
		
	    finally {
			System.out.println("finally block");
		}
		System.out.println("main() method ended");

	}

}
