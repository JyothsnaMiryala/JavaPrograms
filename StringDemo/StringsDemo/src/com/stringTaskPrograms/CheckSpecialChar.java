package com.stringTaskPrograms;
import java.util.*;
public class CheckSpecialChar {

	public static void main(String[] args) {
		int count=0;
		ArrayList<Character>a=new ArrayList<Character>();
		String str1="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		for(int i=0;i<str1.length();i++) {
			a.add(str1.charAt(i));
		}
		String str2="@Navya#Java$Tech1";
		for(int i=0;i<str2.length();i++) {
			if(!a.contains(str2.charAt(i)) && !Character.isWhitespace(str2.charAt(i))){
				count++;
			}
		}
		if(count==0) {
			System.out.println("No special Charactres found");
			
		}
		else {
			System.out.println("String has special Charactres:"+count);
		}
	}

}
