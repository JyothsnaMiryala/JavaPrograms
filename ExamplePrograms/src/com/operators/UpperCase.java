package com.operators;

public class UpperCase {
	public static void main(String[] args)
    {
      
        String m = "JYO";
        String newstr = "";
        String upper = "";
        System.out.println(Uppercase(m, newstr, upper));
        
    }
	private static String Uppercase(String m, String newstr, String upper) {
		for (int i = 0; i < m.length(); i++) {
            if (Character.isUpperCase(m.charAt(i))) {
                upper += m.substring(i, i + 1);
            }
            else {
                newstr += m.substring(i, i + 1);
            }
        }
        System.out.println(newstr + upper);
		return upper;
    }
	}

