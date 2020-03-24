package com.programs;

public class Lcm {
	static int lcm(int x, int y)
	{
		int a;
		a=(x>y)?x:y;
		while(true)
		{
			if(((a%x)==0)&&((a%y)==0))
			{
				return a;
			
			}
			a++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lcm of two numbers is:"+lcm(10, 20));

	}

}
