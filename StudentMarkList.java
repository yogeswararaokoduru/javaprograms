package com.programs;

import java.util.Scanner;

public class StudentMarkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks for 5 subjects:");
		int mark[]=new int[5];
		int sum=0;
		float avg;
		for (int i = 0; i <5; i++) {
			mark[i]=sc.nextInt();
			sum=sum+mark[i];
			
		}
		avg=sum/5;
		System.out.println("total marks:"+sum);
		System.out.println("avg is:"+avg);
		if(avg>80)
		{
			System.out.println("A grade");
		}
		else if (avg>60&&avg<=80) {
			System.out.println("B grade");
			
		}
		else if (avg>45&&avg<=60) {
			System.out.println("C grade");
		}
		else if (avg>40&&avg<=45) {
			System.out.println("D grade");
		}
		else
			System.out.println("U grade");

	}

}
