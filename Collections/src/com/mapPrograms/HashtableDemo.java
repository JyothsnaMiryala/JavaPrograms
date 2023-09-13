package com.mapPrograms;
import java.util.*;
public class HashtableDemo {

	public static void main(String[] args) {
		Hashtable h = new Hashtable();
          h.put(new Temp1(5), "A");
          h.put(new Temp1(2), "B");
          h.put(new Temp1(6), "C");
          h.put(new Temp1(15), "D");
          h.put(new Temp1(23), "E");
          h.put(new Temp1(16), "F");
         //h.put("navya", null);
          System.out.println(h);//{6=C, 16=F, 15=D, 2=B, 23=E, 5=A}
	}

}
