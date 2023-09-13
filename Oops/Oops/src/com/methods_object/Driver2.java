package com.methods_object;

public class Driver2 {

	public static void main(String[] args) {
		Driver2 d = new Driver2();
		Person per =d.m1(101);
		System.out.println(per.id+"..."+per.name+"..."+per.age);
        System.out.println(per.hashCode());
	}

	Person m1(int id) {
		Person p =new Person();
		if(id==101) {
			p.id=101;
			p.name="navya";
			p.age=23;
		}
		else if(id==102) {
			p.id=102;
			p.name="jyo";
			p.age=22;
		}
		 System.out.println(p.hashCode());
		return p;
		
		
		
	}

}
