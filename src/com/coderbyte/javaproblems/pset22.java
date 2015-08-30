package com.coderbyte.javaproblems;

public class pset22 {
	String DivisionStringified(int num1, int num2) {
		 int tempresult = num1/num2;
		 String tempstr = Integer.toString(tempresult);
		 StringBuffer result = new StringBuffer(tempstr);
		 int Length = result.length();
		 int count = 1;
		 for (int i=Length-1; i>=1; i--) {
			 if (count%3==0) {
				 result.insert(i, ",");
			 }
			 count++;
		 }
		 return result.toString();
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset22 c = new pset22();
		System.out.print(c.DivisionStringified(101435710, 2));
	}

}
