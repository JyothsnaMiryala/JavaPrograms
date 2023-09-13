package com.stringTaskPrograms;
import java.util.*;
public class SortingCollectionOFStr_Sb {

	public static void main(String[] args) {
		 Set<String> str = new TreeSet<String>();
	        str.add("Navya");
	        str.add("Srilatha");
	        str.add("Nanditha");
	        str.add("Karthika");
	        System.out.println(str);
	        
	     Set<StringBuffer> str1 = new TreeSet<>();
	        str1.add(new StringBuffer("Navya"));
	        str1.add(new StringBuffer("Srilatha"));
	        str1.add(new StringBuffer("Karthika"));
	        str1.add(new StringBuffer("Nanditha"));
	        str1.add(new StringBuffer("Jyothsna"));
	        System.out.println(str1);
	}

}
