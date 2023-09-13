package com.stringDemo;

public class Test {

	public static void main(String[] args) {
		String s1 ="Navya";
		String s2 ="Karthika";
		String s3 = new String("Navya");
	    s3 = null;
	    if(s1==s2) {
	    	System.out.println("Both rferences poinetd to same object");
	    	
	    }
	    else {
	    	System.out.println("Both references not pointed to same object");
	    }

	}

}
