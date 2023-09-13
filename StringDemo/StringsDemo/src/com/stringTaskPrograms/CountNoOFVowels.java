package com.stringTaskPrograms;
import java.util.*;
public class CountNoOFVowels {

	public static void main(String[] args) {
		int count=0;
		String str ="Welcome to Vtalent";
		str=str.toLowerCase();
        String vow ="aeiou";
        ArrayList<Character> vowels =new ArrayList<Character>();
        for(int i=0;i<vow.length();i++) {
        	vowels.add(vow.charAt(i));
        }
        for(int i=0;i<str.length();i++) {
        	if(vowels.contains(str.charAt(i))) {
        		count++;
        	}
        }
        System.out.println("Total number of vowels in a String are:"+count);
	}

}
