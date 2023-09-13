package com.stringTaskPrograms;

public class StringToByteArray {

	public static void main(String[] args) {
		
		String str = "Hello GoodMorning";
		System.out.println("String:"+str);
		byte[] byteArray=str.getBytes();
		System.out.println("ByteArray");
		for(int i=0;i<byteArray.length;i++) {
			System.out.println(byteArray[i]+" ");
		}

	}

}
