package com.coderbyte.javaproblems;

public class pset25 {
	String DashInsert(String str) { 
		String[] str1 = str.split("");
		String newStr = new String();
		for(int i=1; i<str1.length-1; i++){
			if((Integer.parseInt(str1[i])) % 2 != 0 )
				if(Integer.parseInt(str1[i+1]) % 2 != 0)
					newStr += str1[i] + "-";
				else
					newStr += str1[i] ;
			else 
				newStr += str1[i];
		}
		newStr += str1[str1.length-1];
		
		return newStr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset25 c = new pset25();
		System.out.print(c.DashInsert("12"));
	}

}
