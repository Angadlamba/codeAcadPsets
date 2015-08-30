package com.coderbyte.javaproblems;

public class pset9 {
	String TimeConvert(int num) {
		int hr = num / 60;
		int min = num % 60;
		String str = new String();
		str = hr + ":" + min;
		return str;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset9 c = new pset9();
		System.out.print(c.TimeConvert(125));
	}

}
