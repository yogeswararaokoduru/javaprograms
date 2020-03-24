package com.programs;

import java.util.Scanner;

//PALINDROME  525=525
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n,r,rev=0;
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		n=num;
		while(num>0)
		{
			r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		if(n==rev)
		{
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not palindrome");
		}

	}

}
