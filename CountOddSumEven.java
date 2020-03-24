package com.programs;

import java.util.Scanner;

public class CountOddSumEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count=0,sum=0;
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		System.out.println("Enter the numbers in array:");
		int num[]=new int[n];
		for (int i = 0; i < n; i++) {
		  num[i]=sc.nextInt();
			
		}
		for (int i = 0; i < n; i++) {
			if(num[i]%2!=0)
			{
				System.out.println("count odd is:"+count);
				count++;
			}
		
			else
			{
				sum=sum+num[i];
				System.out.println("sum is:"+sum);
			}
		}
			
		
	

	}

}
