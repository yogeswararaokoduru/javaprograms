package com.programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String:");
		String a=sc.next();
		String rev="";
		for (int i=a.length()-1; i>=0; i--) {
			rev=rev+a.charAt(i);	
		}
		System.out.println("Reverse  String is:"+rev);
		

	}

}
