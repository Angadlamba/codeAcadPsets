package com.coderbyte.javaproblems;

public class pset36 {
	int Division(int num1, int num2) {
		int hcf = 1;
		for(int i=1; i<=Math.min(num1, num2); i++){
			if((num1%i == 0) && (num2%i == 0))
				hcf = i;
		}
		return hcf;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset36 c = new pset36();
		System.out.print(c.Division(12, 16));
	}

}
