package com.stringTaskPrograms;
//using replaceAll() method
public class ReplaceDemo {

	public static void main(String[] args) {
		String str ="Welcome to JavaTech";
		System.out.println("Before Replacement:"+str);
		System.out.println("After replacement:"+str.replaceAll("(.*)Java(.*)", "Navya"));

	}

}
