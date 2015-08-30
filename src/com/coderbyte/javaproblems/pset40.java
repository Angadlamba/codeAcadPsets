package com.coderbyte.javaproblems;

public class pset40 {
	int BinaryConverter(String str) {
		int count = str.length();
		int binNum = Integer.parseInt(str);
		int decNum = 0;
		int i=0;
		while(i < count){
			decNum += (binNum%10) * (Math.pow(2, i));
			binNum /= 10;
			i++;
		}
		return decNum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset40 c = new pset40();
		System.out.print(c.BinaryConverter("11121"));
	}

}
