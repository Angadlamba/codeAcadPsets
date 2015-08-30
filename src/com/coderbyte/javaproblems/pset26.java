package com.coderbyte.javaproblems;

public class pset26 {
	String SwapCase(String str) {
		String str1 = new String();
		for(int i=0;i<str.length(); i++){
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				str1 = str1 + (char)(str.charAt(i) - 32);
			else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				str1 = str1 + (char)(str.charAt(i) + 32);
			else
				str1 = str1 + str.charAt(i);
		}
		
		return str1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset26 c = new pset26();
		System.out.print(c.SwapCase("123gg))(("));
	}

}
