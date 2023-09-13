package com.userDfndExProgram;

public class Employee {
	public String getName(int id) {
		if(id==100) {
			return "Navya";
		}
		else if(id==101) {
			return "Jyothsna";
		}
		else {
			throw new NoDataFoundException("Invalid Id");
		}
		
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.getName(200);
	}

	
}
