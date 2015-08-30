package com.coderbyte.javaproblems;

public class pset27 {
	int NumberAddition(String str) { 
		String[] str1 = str.split("[^0-9]+");
		int sum = 0;
		
		for(int i=0; i<str1.length; i++)
			if(str1[i].matches("[0-9]+"))
				sum += Integer.parseInt(str1[i]);
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset27 c = new pset27();
		System.out.print(c.NumberAddition("55Hello 6"));
	}

}
