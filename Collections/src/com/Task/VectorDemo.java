package com.Task;
import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		System.out.println("Initial capacity-"+v.capacity());
		for(int i =1; i<=10; i++) {
			v.addElement(i);
		}
		System.out.println(v.capacity());
		v.add("A");
		System.out.println(v.capacity());
		System.out.println(v);
		
		System.out.println("******************************************************");

		Vector v1 = new Vector(24);
		System.out.println("Initial capacity-"+v1.capacity());
		for(int i =1; i<=10; i++) {
			v1.addElement(i);
		}
		System.out.println(v1.capacity());
		v1.add("A");
		System.out.println(v1.capacity());
		System.out.println(v1);
		
		
		System.out.println("******************************************************");
		Vector v2 = new Vector(10,5);
		System.out.println("Initial capacity-"+v2.capacity());
		for(int i =1; i<=10; i++) {
			v2.addElement(i);
		}
		System.out.println(v2.capacity());
		v2.add("A");
		System.out.println(v2.capacity());
		System.out.println(v2);
	}
	

}
