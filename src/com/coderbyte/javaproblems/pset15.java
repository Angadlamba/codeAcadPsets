package com.coderbyte.javaproblems;

public class pset15 {
	String ExOh(String str) {
		int countX = 0;
		int countO = 0;
		for(int i=0; i<str.length(); i++)
			if(str.charAt(i) == 'x')
				countX++;
			else
				countO++;
		if(countX == countO)
			return "true";
		else
			return "false";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset15 c = new pset15();
		System.out.print(c.ExOh("xoox"));
	}

}
