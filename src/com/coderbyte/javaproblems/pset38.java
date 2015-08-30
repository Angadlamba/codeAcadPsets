package com.coderbyte.javaproblems;

public class pset38 {
	String ArithGeoII(int[] arr) {
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
		pset38 c = new pset38();
		int[] arr = {1,2,3,4};
		System.out.print(c.ArithGeoII(arr));
	}
}
