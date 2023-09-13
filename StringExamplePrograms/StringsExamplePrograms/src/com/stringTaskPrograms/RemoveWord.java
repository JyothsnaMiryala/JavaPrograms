package com.stringTaskPrograms;

public class RemoveWord {
	public static void remove(String str,String word) {
		String[] StringArray =str.split(" ");
		String new_str="";
		for(String str1:StringArray) {
			if(!str1.equals(word)) {
				new_str +=str1+" ";
			}
		}
		System.out.println(new_str);
	}

	public static void main(String[] args) {
		
		String str ="My name is abc Navya Thati";
		String word ="abc";
		remove(str,word);
			
		
	}

}
