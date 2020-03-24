package com.programs;

import java.util.Scanner;

//TABLES 2*1=2
public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the table number:");
		int n=sc.nextInt();
		for (int c= 1; c<=10; c++) {
			System.out.println(n+"*"+c+"="+(n*c));
			
		}

	}

}
