package com.coderbyte.javaproblems;

public class pset12 {
	int VowelCount(String str) { 
		int count = 0;
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
				count++;
		}
	    return count;
	  } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset12 c = new pset12();
		System.out.print(c.VowelCount("hello"));	
	}

}
