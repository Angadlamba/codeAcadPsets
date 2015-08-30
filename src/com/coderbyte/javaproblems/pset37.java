package com.coderbyte.javaproblems;

import java.util.ArrayList;
import java.util.List;

public class pset37 {
	boolean StringScramble(String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();
		int count = 0;
		if(len1 < len2)
			return false;	

		while(count < (int)Math.pow(len1, len2)){
			String s = shuffle(str1);

			if(s.contains(str2))
				return true;
			else
				count++;
		}
		return false;
	}
	
	String shuffle(String input){
        List<Character> characters = new ArrayList<Character>();
        for(char c:input.toCharArray()){
            characters.add(c);
        }
        StringBuilder output = new StringBuilder(input.length());
        while(characters.size()!=0){
            int randPicker = (int)(Math.random()*characters.size());
            output.append(characters.remove(randPicker));
        }
        return output.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset37 c = new pset37();
		System.out.print(c.StringScramble("thsisifasl3", "thsasifl3is"));
	}

}
