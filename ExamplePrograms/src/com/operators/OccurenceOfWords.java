package com.operators;

import java.util.*;;

public class OccurenceOfWords {

	public static void main(String[] args)
    {
	   String str = "Rani is girl and Raju is boy";
	   Map<String, Integer> m =OccurrenceofWords(str);
	   System.out.println(m);
    }

	private static Map<String, Integer> OccurrenceofWords(String str) {
		 Map<String, Integer> hashMap = new HashMap<>();
		    String[] words = str.split(" ");
		    for (String word : words) {
		         if (hashMap.containsKey(word))hashMap.put(word, hashMap.get(word) + 1);
		            else
		              hashMap.put(word, 1);
		        }	
		        
				return hashMap;
		    
	
	}
}



