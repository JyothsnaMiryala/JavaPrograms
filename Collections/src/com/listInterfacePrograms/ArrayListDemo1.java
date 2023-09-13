package com.listInterfacePrograms;

import java.util.*;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList<String> namesList = new ArrayList<String>();

		namesList.add("Navya");
		namesList.add("Thirupathi");
		namesList.add("TejaHarsha");
		namesList.add("Sujatha");
		System.out.println("ArrayList:" + namesList);

		namesList.remove("Navya");
        System.out.println("ArrayList after removing an element:" + namesList);
        
        namesList.add("Jyothsna");
        System.out.println("After adding an element:"+namesList);
        
        int arrayListsize=namesList.size();
        System.out.println("Size of ArrayList:"+arrayListsize);
	    
        String element=namesList.get(2);
        System.out.println("Element at index-2:"+element);
        
        namesList.set(3,"Shiva");
        System.out.println("ArrayList after setting an element:"+namesList);
	
	    boolean ele1= namesList.contains("Shiva");
	    System.out.println(ele1);
	
	    boolean ele2= namesList.contains("Navya");
	    System.out.println(ele2);
	    
	    boolean ele3=namesList.containsAll(namesList);
	    System.out.println(ele3);
	    
	    boolean ele4=namesList.removeAll(namesList);
	    System.out.println(ele4);
	    
	    boolean ele5 = namesList.retainAll(namesList);
	    System.out.println(ele5);
	    
	    System.out.println(namesList);
	    System.out.println(namesList.isEmpty());
	
	    namesList.clear();
	    System.out.println(namesList);
	    
	   
	    
	}
}
