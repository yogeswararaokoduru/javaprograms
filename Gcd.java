package com.programs;

public class Gcd {
	static int gcd(int x, int y){
		int r=0,a,b;
		a=(x>y)?x:y;
		b=(x<y)?x:y;
		r=b;
		while((a%b)!=0){
			r=a%b;
			a=b;
			b=r;
		}
		return r;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Gcd of two numbers is:"+gcd(10, 20));

	}

}
