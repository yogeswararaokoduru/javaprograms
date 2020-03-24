package com.programs;

import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String word=sc.next();
		char ch[]=word.toCharArray();
		
		for(int i=0;i<word.length();i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				continue;
			}
			else
			{
				System.out.println("remove vowels  is:"+ch[i]);
				
			}
		}
		


	}

}
