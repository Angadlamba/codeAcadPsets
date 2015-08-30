package com.coderbyte.javaproblems;

public class pset2 {
	int FirstFactorial(int num) {
		if (num == 1)
			return 1;
		else 
			return num * FirstFactorial(num-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset2 c = new pset2();
		System.out.println(c.FirstFactorial(10));
	}

}
