package com.programs;

import java.util.Scanner;

//FIBONACCI SERIES (ADDING PREVIOUS NUMBER)
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int first=0,second=1,next;
		System.out.println("Enter the number of series:");
		int num=sc.nextInt();
		for(int i=0;i<=num;i++)
		{
			System.out.println(first);
			next=first+second;
			first=second;
			second=next;
		}

	}

}
