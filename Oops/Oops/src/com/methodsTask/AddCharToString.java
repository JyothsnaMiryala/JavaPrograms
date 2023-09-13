package com.methodsTask;

public class AddCharToString {
	public static void main(String[] args) {

		String str = "avaprogram";
		System.out.println("String-"+str);
		char ch = 'J';

		String newString=addCharToString(str, ch, 0);
         System.out.println("NewString-"+newString);
	}

	public static String addCharToString(String str, char ch, int position) {

		StringBuffer sb = new StringBuffer(str);
		System.out.println("StringBuffer-"+sb);
		System.out.println("Adding character to StringBuffer at given position");
		sb.insert(position, ch);
		
		  return sb.toString();


	}

}
