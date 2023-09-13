package com.stringTaskPrograms;

 public enum Fruits {
   
	Orange,
	Apple,
	Banana,
	Mango;
}
 class EnumtoString{
	public static void main(String[] args) {
		System.out.println("********using name()*******");
		System.out.println(Fruits.Orange.name());
		System.out.println(Fruits.Apple.name());
		System.out.println(Fruits.Banana.name());
		System.out.println(Fruits.Mango.name());
		System.out.println("********using toString()******");
		System.out.println(Fruits.Orange.toString());
		System.out.println(Fruits.Apple.toString());
		System.out.println(Fruits.Banana.toString());
		System.out.println(Fruits.Mango.toString());
			}
}
