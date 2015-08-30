package com.coderbyte.javaproblems;

public class pset30 {
	int AdditivePersistence(int num) { 
		if(num/10 < 1)
			return 0;
		else
		{
			int total = 0;
			while(num > 0) {
				total = total + num%10;
				num = num/10;
			}
			return 1 + AdditivePersistence(total);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset30 c = new pset30();
		System.out.print(c.AdditivePersistence(27));
	}

}
