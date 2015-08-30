package com.coderbyte.javaproblems;

import java.text.DecimalFormat;

public class pset44 {
	String FormattedDivision(int num1, int num2) {

        String s1 = String.valueOf(num1/num2);
        if (s1.length() > 3) {
            for (int i = s1.length() - 4; i >= 0; i -= 3) {
                s1 = s1.substring(0, i+1) + "," + s1.substring(i + 1, s1.length());
            }
        }

        DecimalFormat myFormat = new DecimalFormat(".0000");
        String s2 = myFormat.format((double) num1 / num2 - num1 / num2);
        return s1+s2;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset44 c = new pset44();
		System.out.print(c.FormattedDivision(121353, 4));
	}

}
