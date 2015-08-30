package com.coderbyte.javaproblems;

public class pset28 {
	void removeLongest(String[] arr) {
   	    int max = 0;
		int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > max) {
                max = arr[i].length();
              	index = i;
            }
        }
    	arr[index] = "";
  }
  
  String ThirdGreatest(String[] arr) { 
  		
    	removeLongest(arr);
    	removeLongest(arr);
    	
        String word = new String();
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > max) {
                max = arr[i].length();
                word = arr[i];
            }
        }
       
    return word;
    
  } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset28 c = new pset28();
		String[] arr = {"hello", "world", "before", "all"};
		System.out.print(c.ThirdGreatest(arr));
	}

}
