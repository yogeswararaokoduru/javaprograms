package com.programs;

import java.util.Scanner;

public class RemoveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n=sc.nextInt();
		int num[]=new int[n];
		System.out.println("Enter the numbers to array:");
		for(int i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
		}
		System.out.println("Enter the number to delete:");
		int number=sc.nextInt();
		for (int i = 0; i < n; i++) {
			if(num[i]==number)
			{
				continue;
			}
			else
			{
				System.out.println("after removal:"+num[i]);
			}
		}
		
	}

}
