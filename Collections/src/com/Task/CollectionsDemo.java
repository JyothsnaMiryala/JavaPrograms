package com.Task;
import java.util.*;
public class CollectionsDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		System.out.println(al1);
		
		System.out.println("Size-"+al1.size());
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(60);
		al2.add(70);
		System.out.println(al2);
		
		al1.addAll(al2);
		System.out.println(al1);
		System.out.println("Size-"+al1.size());
		
		System.out.println(al1.contains(50));
		System.out.println(al1.containsAll(al2));
		
		al1.remove(5);
		System.out.println(al1);
		
		al1.retainAll(al2);
		System.out.println(al1);
		
		al1.removeAll(al2);
		System.out.println(al1);
		
		System.out.println(al1.isEmpty());
		
		al1.add(80);
		al1.add(90);
		al1.add(100);
		
		System.out.println(al1.toArray());
		al1.clear();
		System.out.println(al1);
		
	}

}
