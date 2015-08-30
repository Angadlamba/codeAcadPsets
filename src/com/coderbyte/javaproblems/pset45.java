package com.coderbyte.javaproblems;

public class pset45 {
	int CountingMinutes(String input) { 
	    String[] times = input.split("-");
			
		int mins1 = getMins(times[0]);
		int mins2 = getMins(times[1]);
			
		if( mins2 > mins1 ){
	      return mins2 - mins1;
		} else{
	      return mins2 + (1440 - mins1);
		}
	  }

	  int getMins(String time) {
		int mins = 0;
			
	    String[] parts = time.split(":");
			
		if( parts[1].endsWith("am") ){
	      mins += 60 * Integer.parseInt(parts[0]);
		} else{
	      mins += 60 * (Integer.parseInt(parts[0]) + 12);
		}
			
		mins += Integer.parseInt(parts[1].substring(0, 2));
		return mins;
	  } 
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset45 c = new pset45();
		System.out.print(c.CountingMinutes("1:23am-1:08am"));
	}

}
