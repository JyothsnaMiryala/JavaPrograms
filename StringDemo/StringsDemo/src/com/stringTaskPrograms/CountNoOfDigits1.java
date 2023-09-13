package com.stringTaskPrograms;
import java.util.*;
public class CountNoOfDigits1 {

	public static void main(String[] args) {
		String str ="Internet Banking Password is: navya1764";
        String num="0123456789";
        ArrayList<Character> numbers= new ArrayList<>();
        for(int i=0;i<num.length();i++)
        {
            numbers.add(num.charAt(i));
        }
        int digits = 0;
        for (int i = 0; i < str.length(); i++) {
            if (numbers.contains(str.charAt(i)))
                digits++;
        }
        System.out.println("Total number of Digits = "+ digits);
    }

	}


