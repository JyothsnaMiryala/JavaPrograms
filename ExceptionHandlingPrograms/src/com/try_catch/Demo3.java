package com.try_catch;

public class Demo3 {

	public static void main(String[] args) {
		System.out.println("main() method started...");
		try {
			System.out.println("try block start...");
			String s = "Hi";
			int i = s.length();
			System.out.println("try block end");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("ArithmeticException");
			e.printStackTrace();
		}
		System.out.println("main() method ended.");
	}

}
