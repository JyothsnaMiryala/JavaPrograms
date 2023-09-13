package com.encapsulation1;

class TestStudent {
	public static void main(String[] args) {
		Student s = new Student();
		s.setStudentId(101);
		s.setStudentName("Navya");
		s.setStudentAge(23);
		
		int id = s.getStudentId();
		String Name = s.getStudentName();
		int age = s.getStudentAge();
		
		System.out.println("StudentId-"+id + " " +"StudentName-" +Name + " " +"StudentAge-"+ age);
	}
}

