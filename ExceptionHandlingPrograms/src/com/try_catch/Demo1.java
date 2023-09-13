package com.try_catch;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started....");
		try {
			System.out.println("try block start...");
			String s = "Navya";
			int length = s.length();
			System.out.println("try block end...");
		} catch (Exception e) {
			System.out.println("In catch block...");
			e.printStackTrace();
			System.out.println("catch block ended.. ");
		}
		System.out.println("main() method ended...");
	}
}
