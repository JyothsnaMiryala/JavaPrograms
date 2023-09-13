package com.stringTaskPrograms;

public class RemoveUpperCharacters {

	public static void main(String[] args) {
	    
		String str ="UnionBank";
		String newstr ="";
		String upper ="";
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				upper =upper+str.substring(i,i+1);
			}
			else {
				newstr=newstr+str.substring(i,i+1);
			}
			
		}
		System.out.println(newstr+"Upper Characters are:"+upper);
		System.out.println("Upper Characters are:"+upper);

	}

}
