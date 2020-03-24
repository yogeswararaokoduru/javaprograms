package com.programs;

import java.util.Scanner;

//SWAP 3 VARIABLES
public class Swap3Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter value of i:");
		int i=sc.nextInt();
		System.out.println("Enter value of j:");
		int j=sc.nextInt();
		int a;
		a=i;
		i=j;
		j=a;
		 System.out.println("After Swapping value of i is:"+i);
		 System.out.println("After swapping value of j is:"+j);
		
		
	

	}

}
