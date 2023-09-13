package com.mapPrograms;
import java.util.WeakHashMap;
import java.util.HashMap;
public class WeekHashMapDemo {
 public static void main(String[] args) throws InterruptedException {
	WeakHashMap m = new WeakHashMap();
	// HashMap m = new HashMap();
	 Temp t = new Temp();
	 m.put(t, "navya");
	 System.out.println(m);
	 t=null;
	 System.gc();
	 Thread.sleep(1000);
	 System.out.println("After calling Garbage Collector-"+m);
}
}

