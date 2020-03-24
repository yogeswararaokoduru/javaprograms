package com.programs;

import java.util.Scanner;

//FACTORIAL 5!=5*4*3*2*1
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int fact=1;
		System.out.println("Enter the number to be factorial:");
		int num=sc.nextInt();
		for (int i = 1; i <= num; i++) {
			fact=fact*i;
			
			}
		System.out.println(fact);

	}

}
