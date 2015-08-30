package com.coderbyte.javaproblems;

public class pset35 {
	String PalindromeTwo(String str) { 
		str = String.join("",str.toLowerCase().split("[^a-zA-Z]"));
		int len = str.length();
	    for(int i=0; i<len/2; i++)
	    	if(str.charAt(i) != str.charAt(len-i-1))
	    		return "false";
	    return "true";  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset35 c = new pset35();
		System.out.print(c.PalindromeTwo("racecar"));
	}

}
