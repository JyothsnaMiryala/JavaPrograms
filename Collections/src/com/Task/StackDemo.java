package com.Task;
import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s);
        System.out.println("offSet:"+s.search("A"));
        System.out.println("offSet:"+s.search("Z"));

	}

}
