package com.programs;

import java.util.Scanner;

//LEAP YEAR
public class LeapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the year:");
		int year=sc.nextInt();
		if((year%4)==0||(year%400)==0)
		{
		    System.out.println("Leap year");	
		}
		else
		{
			System.out.println("Not leap year");
		}

	}

}
