package com.coderbyte.javaproblems;

public class pset31 {
	int MultiplicativePersistence(int num) { 
		if(num/10 < 1)
			return 0;
		else
		{
			int total = 1;
			while(num > 0) {
				total = total * (num%10);
				num = num/10;
			}
			return 1 + MultiplicativePersistence(total);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset31 c = new pset31();
		System.out.print(c.MultiplicativePersistence(25));
	}

}
