package com.programs;

import java.util.Scanner;

public class LargerSmaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size:");
		int n=sc.nextInt();
		int num[]=new int[n];
		int large=num[0];
		int small=num[0];
		System.out.println("Enter numbers in array");
		for (int i = 0; i < n; i++) {
			num[i]=sc.nextInt();
			
		}
		
		for (int i = 0; i < n; i++) {
			
			if(num[i]>large)
			{
			    large=num[i];
			}
			else if (num[i]<small) {
				small=num[i];
				
			}
			}
			System.out.println("larger number in array is:"+large);
			System.out.println("smaller number in array is:"+small);
		}
	}



