package com.coderbyte.javaproblems;

public class pset17 {
	String ArithGeo(int[] arr) {
		if (isArithmetic(arr))
			return "Arithmetic";
		else if (isGeometric(arr))
			return "Geometric";
		
		return "-1";
	}

	private boolean isArithmetic(int[] arr) {
		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[i + 1] - arr[i] != arr[i + 2] - arr[i + 1])
				return false;
		}
		return true;
	}

	private boolean isGeometric(int[] arr) {
		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[i + 1] / (double)arr[i] != arr[i + 2] / (double)arr[i + 1])
				return false;
		}
		return true;
	}
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset17 c = new pset17();
		int[] arr = {2,4,8,16,10,214};
		System.out.print(c.ArithGeo(arr));
	}

}
