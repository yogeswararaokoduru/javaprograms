package com.programs;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=10,b=20,c;
		System.out.println("Enter the option:");
		int option=sc.nextInt();
		switch (option) {
		case 1:
			c=a+b;
			System.out.println("add is:"+c);
			break;
		case 2:
			c=a-b;
			System.out.println("subtract is:"+c);
			break;
		case 3:
			c=a*b;
			System.out.println("multiply is:"+c);
			break;
		case 4:
			c=a/b;
			System.out.println("div is:"+c);
			break;

		default:
			System.out.println("Invalid option");
			break;
		}

	}

}
