// Java Program to Print Quotation Marks in a String
package com.stringTaskPrograms;
//Using Escape Sequence Character
public class PrintQuotationMarks {

	public static void main(String[] args) {
		String str ="\"Navya Loves Java\"";
		System.out.println(str);
		
		
		// Using char
        char value ='"';
        String str1 =value+"Navya Loves Java"+value;
        System.out.println(str1);
  
        // Using Unicode Characters
        String str2 ='\u0022'+"Navya Loves Java"+'\u0022';
        System.out.println(str2);
	}

}
