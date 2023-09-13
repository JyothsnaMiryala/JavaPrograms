package com.mapPrograms;
import java.util.*;
public class IdentityHashMapDemo {

	public static void main(String[] args) {
		//HashMap<Integer,String> m = new HashMap<>();
		IdentityHashMap<Integer,String> m = new IdentityHashMap<>();
		Integer i1= new Integer(10);
		Integer i2= new Integer(10);
		m.put(i1, "pawan");
		m.put(i2, "kalyan");
		System.out.println(m);
	}

}
