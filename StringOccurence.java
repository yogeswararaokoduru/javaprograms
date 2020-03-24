package com.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class StringOccurence {
	
	public void findMaxStringOccuence(List<StringOccurence> strocc){
		String str="hhhhggggyyiong";
	  char [] c=str.toCharArray();
		Map<Character, Integer> map=new HashMap<>();

		for(int i=0;i<str.length();i++){
			//Character ch=str.charAt(i);
			if(map.containsKey(c)){
				int maxoc;
				
			}
			else{
				System.out.println("non repeated characters");
				//map.put(c,1);
				
			}
		}
		 System.out.println(map);

	}
	public static void main(String[] args) {
		StringOccurence stroc=new StringOccurence();
		ArrayList<StringOccurence> strocc=new ArrayList<>();
		stroc.findMaxStringOccuence(strocc);
	}
}
        
		



