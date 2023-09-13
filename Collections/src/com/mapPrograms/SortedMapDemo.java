package com.mapPrograms;
import java.util.*;
public class SortedMapDemo {

	public static void main(String[] args) {
		  SortedMap<Integer, String> sortedMap = new TreeMap<>();
		  sortedMap.put(101, "A");
		  sortedMap.put(103, "B");
		  sortedMap.put(104, "C");
		  sortedMap.put(107, "D");
		  sortedMap.put(136, "F");
		  sortedMap.put(125, "E");
		  System.out.println(sortedMap); //{101=A, 103=B, 104=C, 107=D, 125=E, 136=F}
		  System.out.println(sortedMap.firstKey());
		  System.out.println( sortedMap.lastKey());
		  System.out.println( sortedMap.headMap(107));
		  System.out.println( sortedMap.tailMap(107));
		  System.out.println( sortedMap.subMap(103,105));
		  System.out.println(sortedMap.comparator());
		
	}

}
