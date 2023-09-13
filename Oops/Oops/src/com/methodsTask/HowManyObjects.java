package com.methodsTask;

public class HowManyObjects {

	public static void main(String[] args) {
		String s1 ="Navya";
		String s2 ="Navya";
		String s3 = new String("Navya");
		String s4 = new String("Navya");
		String  s5 = new String("Karthika");
		String s6 = new String("Karthika");
		
		objectscount( s1,s2);
		

	}

	public static void objectscount(String str1,String str2) {
		System.out.println(str1==str2);
		/*System.out.println(s2==s3);
		System.out.println(s3==s4);
		System.out.println(s5==s6);*/
		
	}

}
