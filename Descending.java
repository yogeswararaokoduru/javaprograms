package com.programs;

import java.util.Scanner;

public class Descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size:");
		int n=sc.nextInt();
		int num[]=new int[n];
		System.out.println("Enter the numbers to array:");
		for (int i = 0; i < n; i++) {
			num[i]=sc.nextInt();
			
		}
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if(num[i]<num[j])
				{
					int temp;
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
				
			
		}
			System.out.println("Ascending order is:"+num[i]);
			
		}
	}

}
