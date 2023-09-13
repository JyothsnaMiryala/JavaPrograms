package com.stringTaskPrograms;

public class IsStringOnlyAlphabet_lambdaExp {
	public static boolean isStringOnlyAlphebet(String str) {
		return((str!=null)&&
				(!str.equals("")))&&(
						str.chars().allMatch(Character::isLetter));
	}

	public static void main(String[] args) {
	
		String str ="NAVYA";
		//String str ="NAVYA123";
		System.out.println(isStringOnlyAlphebet(str));

	}

}
