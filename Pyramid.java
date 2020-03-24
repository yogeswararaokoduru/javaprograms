package com.programs;

import java.util.Scanner;

//PYRAMID STAR SEQUENCE
public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of series:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			for (int j = i; j < n; j++) {
				System.out.println("_");
				
			}
			for (int k = 0; k <= i; k++) {
				System.out.println("*_");
				System.out.println();
			}
		}

	}

}
