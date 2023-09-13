package com.Task;
import java.util.*;
public class LinkedListDemo {
  
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.add("Navya");
		ll.add(30);
		ll.add(null);
		ll.add("Navya");
		System.out.println(ll);
		ll.add(0,"software");
		System.out.println(ll);
		ll.add(0,"Jyothsna");
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		ll.addFirst("aaa");
		System.out.println(ll);
		ll.addLast("ddd");
		System.out.println(ll);
	}
}
