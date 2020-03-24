package com.programs;

import java.util.Scanner;
// ARMSTRONG NUMBER

public class Armstrong {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r,n,sum=0;
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		n=num;
		while(num>0){
			r=num%10;
			sum=sum+r*r*r;
			num=num/10;
			
		}
		if(n==sum)
		{
			System.out.println("Armstrong number");
		}
		else{
			System.out.println("not Armstrong number");
		}


	}

}
