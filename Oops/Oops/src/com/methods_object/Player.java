package com.methods_object;

public class Player {
	int id;
	String name;
	int age;
}
class Driver6 {

	void print (Player p1) {
		System.out.println(p1.id +"--"+ p1.name+""+p1.age);
	}

		public static void main(String[] args) {
			Driver6 d = new Driver6( );

			Player p2 = new Player ( );
		p2.id=101;
		p2.name="navya";
		p2.age=23;

			d.print (p2);
		}

}