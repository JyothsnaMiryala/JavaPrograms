package com.inheritance_variables;

public class Student extends Teacher {
           int rank;
	public static void main(String[] args) {
		Student s = new Student();
		s.rank=1;
		s.id=101;
		s.name="Navya";
		System.out.println("id-"+s.id+"..."+"name-"+s.name+"..."+"rank-"+s.rank);

		Teacher t = new Teacher();
		t.id=102;
		t.name="Jyothsna";
		//t.rank=2;
	}

}
