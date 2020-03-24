package com.programs;

import java.util.Scanner;
//PRIME NUMBER
public class PrimeNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int m;boolean flag=false;
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		m=num/2;
		for (int i = 2; i < m; i++) {
			if((num%i)==0){
				System.out.println("Not prime");
				flag=true;
			}
		}
		if(flag){
			
		}
		else
		{
			System.out.println(" prime");
		}
	}
}


