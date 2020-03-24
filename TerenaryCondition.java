package com.programs;

import java.util.Scanner;

//TERENARY (LARGEST)
public class TerenaryCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int largest;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a:");
		int a=sc.nextInt();
		System.out.println("Enter b:");
		int b=sc.nextInt();
		System.out.println("Enter c:");
		int c=sc.nextInt();
		largest=((a>b)&&(a>c)?a:(b>a)&&(b>c)?b:c);
		System.out.println("largest among 3 numbers is:"+largest);

	}

}
