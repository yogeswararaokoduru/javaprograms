package com.programs;

import java.util.Scanner;

public class OddNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size in array:");
		int n=sc.nextInt();
		System.out.println("Enter the numbers for array:");
		int num[]=new int[n];
		for(int i=0;i<n;i++){
			num[i]=sc.nextInt();
			if((num[i])%2!=0)
			{
				System.out.println("Odd numbers in array is:"+num[i]);
			}
			
		}
		

	}

}
