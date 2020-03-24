package com.programs;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String word=sc.next();
		char c[]=word.toCharArray();
		int count=0;
		for(int i=0;i<word.length();i++)
		{
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
			{
				count++;
			}
		}
		System.out.println("count of vowels  is:"+count);
		

	}

}
