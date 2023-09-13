package com.encapsulation1;

public class TestLogin {
  public static void main(String[] args) {
	  Login l = new Login();
	  l.setUserName("Navyathati");
	  l.setPassword("56545");
	  l.setPhNumber(8163255565l);
	  
	  String username=l.getUserName();
	  String password=l.getPassWord();
	  long phNumber=l.getPhNumber();
	  
	  System.out.println("username-"+username+"..."+"password-"+password+"..."+"phNumber-"+phNumber);
}
}
