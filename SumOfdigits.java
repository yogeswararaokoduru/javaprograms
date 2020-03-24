package com.programs;

import java.util.Scanner;

import javax.security.sasl.SaslClient;

//SUM OF DIGITS 123=1+2+3=6
public class SumOfdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r,sum=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		n=num;
		while(num>0)
		{
			r=num%10;
			sum=sum+r;
			num=num/10;
		}
		System.out.println(sum);
		

	}

}
