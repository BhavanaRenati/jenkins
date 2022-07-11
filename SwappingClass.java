package com.swapping.example;

public class SwappingClass {

	public static void main(String[] args) {
		int a= 10; //20   10 20 30  20 10 30   20 30 10
		int b=20; //30
	
				
		
		System.out.println("Before swapping:" + a + " " + b);
		
		
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping:" + a + " " + b);
		

	}
	
}
