package com.programs;

import java.util.Scanner;

public class Swap2String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String:");
		String a=sc.next();
		System.out.println("Enter the second String:");
		String b=sc.next();
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("After swapping str1 is:"+a);
		System.out.println("After swapping str2 is:"+b);


	}

}
