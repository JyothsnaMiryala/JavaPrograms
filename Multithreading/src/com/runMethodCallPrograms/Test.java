package com.runMethodCallPrograms;

public class Test {
    public static void main(String[] args) {
    	ThreadDemo td = new ThreadDemo();
    	Thread t = new Thread(td);
    	t.run();//when we call run() method it will executed like a normal method by main thread
	    t.start();//when we call start() method it will executed run method by child thread
	    
    }
}

