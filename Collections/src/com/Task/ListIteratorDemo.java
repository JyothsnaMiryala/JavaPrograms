

package com.Task;

import java.util.*;

public class ListIteratorDemo {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<>();
        ll.add("Navya");
        ll.add("Jyothsna");
        ll.add("Srilatha");
        ll.add("Anusha");
        System.out.println(ll);
        ListIterator itr=ll.listIterator();
        while(itr.hasNext()) {
        	String s=(String)itr.next();
        	if(s.equals("Srilatha")) {
        		itr.remove();
        	}
        	else if(s.equals("Navya")) {
        		itr.set("Vilasini");
        	}
        }
        System.out.println(ll);
	}

}
