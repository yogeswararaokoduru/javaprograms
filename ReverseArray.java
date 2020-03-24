package com.programs;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,4};
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+"");
		}
		System.out.println();
		System.out.println("Reverse order");
		for(int i=a.length-1;i>=0;i--){
			System.out.println(a[i]+"");
		}

	}

}
