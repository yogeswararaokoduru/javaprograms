package com.programs;

import java.util.Scanner;

//NUMBER OF DIGITS 153- 3 DIGITS
public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a=0;
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		while (num>0) {
			num=num/10;
			a++;
			
		}
		System.out.println(a);

	}

}
