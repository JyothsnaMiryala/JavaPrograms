package com.methodsTask;

public class CharArrayOverString {
	public static void main(String[] args) {

        String strPwd = "navya@41";
        char[] charPwd =  {'n','a','v','y','a','@','4','1'};
        charArrayOverString(strPwd,charPwd );
        
	}

	private static void charArrayOverString(String strPwd, char[] charPwd) {
		 System.out.println("String password: " + strPwd );
	        System.out.println("Character password: " + charPwd );
		
	}

	
}
