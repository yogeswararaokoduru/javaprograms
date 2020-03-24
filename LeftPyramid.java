package com.programs;

import java.util.Scanner;

public class LeftPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of serirs:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for (int j = n; j >=i; j--) {
				System.out.println("_");
				
			}
			for (int k = 1; k <= i; k++) {
				System.out.println("*");
				System.out.println();
			}

	}

	}
}
