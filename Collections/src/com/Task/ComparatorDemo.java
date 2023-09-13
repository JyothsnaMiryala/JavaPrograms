/*Write a program to insert integer Objects 
into the TreeSet where the sorting order is descending order*/

package com.Task;
import java.util.*;
public class ComparatorDemo {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
        t.add(10);
        t.add(0);  
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(20);
       System.out.println(t);
    }

}
