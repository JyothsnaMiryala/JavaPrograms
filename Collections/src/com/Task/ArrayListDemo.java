package com.Task;
import java.io.Serializable;
import java.util.*;
class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("A");
		al.add(10);
		al.add("A");
		al.add(null);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.add(2, "M");
		al.add("N");
		System.out.println(al);
		
		System.out.println("ArrayList class implements Serializable and Cloneable");
		System.out.println(al instanceof Serializable);
		System.out.println(al instanceof Cloneable);
		
		System.out.println("LinkedList class implements Serializable and Cloneable");
		LinkedList ll= new LinkedList();
		System.out.println(ll instanceof Serializable);
		System.out.println(ll instanceof Cloneable);
	}

}
