package com.coderbyte.javaproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class pset32 {
	String OffLineMinimum(String[] strArr) {
        List<Integer> allNumbers = new ArrayList<Integer>();
        List<Integer> numbers = new ArrayList<Integer>();

        for (String str : strArr) {
            if (str.equals("E")) {
                moveSmallestNum(allNumbers, numbers);
            } else {
                allNumbers.add(Integer.parseInt(str));
            }
        }

        StringBuilder builder = new StringBuilder("");
        for (int i = 0; i < numbers.size(); i++) {
            builder.append(numbers.get(i));
            if (i < numbers.size() - 1) builder.append(",");
        }
        	
        return builder.toString();
	}

    void moveSmallestNum(List<Integer> allNumbers, List<Integer> numbers) {
        Collections.sort(allNumbers);
        Integer smallestNum = allNumbers.get(0);
        numbers.add(smallestNum);
        allNumbers.remove(smallestNum);
    }
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset32 c = new pset32();
		String[] str = {"5","4","6","E","1","7","E","E","3","2"};
		System.out.print(c.OffLineMinimum(str));
	}
}
