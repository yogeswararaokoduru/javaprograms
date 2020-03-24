package com.programs;

import java.util.Scanner;

public class MaxOccurenceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String word=sc.next();
		int freq[]= new int[word.length()];
		char minChar = word.charAt(0);
		char maxChar = word.charAt(0);
		char str[]=word.toCharArray();
		int max,min;
		min=max=freq[0];
		for (int i= 0; i < freq.length; i++) {
			if(min>freq[i]&&freq[i]!=0)
			{
				min=freq[i];
				minChar=str[i];
			}
			else if(max<freq[i])
			{
				max=freq[i];
				maxChar=str[i];
			}
		}
		System.out.println("max occurence of string is:"+max);
		System.out.println("min occurence of string is:"+min);

	}

}
