package com.programs;

import java.util.Scanner;

public class Swap3Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String:");
		String str1=sc.next();
		System.out.println("Enter the second String:");
		String str2=sc.next();
		String temp;
		
		temp=str1;
		str1=str2;
		str2=temp;
		System.out.println("After swapping str1 is:"+str1);
		System.out.println("After swapping str2 is:"+str2);

	}

}
