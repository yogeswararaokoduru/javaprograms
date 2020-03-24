package com.programs;

import java.util.Scanner;

public class SecondLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n=sc.nextInt();
		int num[]=new int[n];
		int large=num[0];
		int secLarge=num[0];
		System.out.println("Enter the numbers to array:");
		for (int i = 0; i < num.length; i++) {
			num[i]=sc.nextInt();
			
		}
		for (int i = 0; i < num.length; i++) {
			if(num[i]>large){
				secLarge=large;
				large=num[i];
			}
			else if(num[i]<large){
				secLarge=num[i];
				
			}
		}
          System.out.println("Second largest element is:"+secLarge);
	}

}
