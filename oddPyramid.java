package com.programs;

import java.util.Scanner;

public class oddPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the series:");
		int n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.println("_");
			}
			for(int k=0;k!=(2*i-1);k++){
				System.out.println("*_");
				System.out.println();
				
			}
		}

	}

}
