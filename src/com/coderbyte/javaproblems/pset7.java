package com.coderbyte.javaproblems;

public class pset7 {
	boolean SimpleSymbols(String str) { 
		  
		int Length = str.length();
		for (int i=0; i<Length; i++) {
			char CurrentChar = str.charAt(i);
			int CurrentInt = (int)CurrentChar;
			if (((CurrentInt>=65)&&(CurrentInt<=90))||((CurrentInt>=97)&&(CurrentInt<=122))) {
				//Is Char
				if ((i==0)||(i==Length-1)) return false;
				if (str.charAt(i-1)!='+') return false;
				if (str.charAt(i+1)!='+') return false;
			}
		}
		return true;
  } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset7 c = new pset7();
		System.out.print(c.SimpleSymbols("d+=3=+s+"));
	}

}
