package com.programs;

import java.util.Scanner;

//SWAP 2 VARIABLES
public class Swap2Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value x:");
		int x=sc.nextInt();
		System.out.println("Enter the value of y:");
		int y=sc.nextInt();
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping value of x is:"+x);
		System.out.println("Ater swapping value of y is:"+y);
	

	}

}
