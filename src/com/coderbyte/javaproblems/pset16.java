package com.coderbyte.javaproblems;

public class pset16 {
	String Palindrome(String str) { 
		str = String.join("",str.split(" "));
		int len = str.length();
	    for(int i=0; i<len/2; i++)
	    	if(str.charAt(i) != str.charAt(len-i-1))
	    		return "false";
	    return "true"; 
	    
	  } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset16 c = new pset16();
		System.out.print(c.Palindrome("dont nod"));
	}

}
