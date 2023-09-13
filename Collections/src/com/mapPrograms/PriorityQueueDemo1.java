package com.mapPrograms;

import java.util.PriorityQueue;

public class PriorityQueueDemo1 {

	public static void main(String[] args) {
		PriorityQueue<String> q= new PriorityQueue<>(15, new MyComparator1());
		q.offer("A");
		q.offer("Z");
		q.offer("L");
		q.offer("B");
		System.out.println(q);
		
	}

}
