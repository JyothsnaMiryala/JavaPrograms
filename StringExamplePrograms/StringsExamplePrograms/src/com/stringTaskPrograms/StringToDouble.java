package com.stringTaskPrograms;

public class StringToDouble {

	public static void main(String[] args) {
		//using Double.parseDouble
		String str ="12.5146545";
		double d=Double.parseDouble(str);
		System.out.println(d);
		//using Double.valueOf
		double d1 =Double.valueOf(d);
		System.out.println(d1);
		// Using Constructor of Double class
		 Double d2 = new Double(d);
			System.out.println(d2);


	}

}
