package com.swapping.example;

public class SwappingExample {
	
	public static void main(String[] args) {
		
		
		int a= 10; //20   10 20 30  20 10 30   20 30 10
		int b=20; //30
	//	int c=30; // 10
				
		
		System.out.println("Before swapping:" + a + " " + b);
		
//int temp=a;
//a=b;
//b=c;
//c=temp;

//		int temp=a;
//		a=b;
//		b=temp;
		
		
		
		
//a=a+b+c;   // a=60 20
//b=a-b-c;  // b=10  30
//c=a-b-c;   //c=20  10
//a=a-b-c;   // 
		
		
		a=a+b;   // a=60 20
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping:" + a+ " "+b);
		 
	}
}

//num1 = num1+ num2+ num3; 
//num2 = num1- (num2+ num3); 
//num3 = num1- (num2+ num3); 
//num1 = num1- (num2+ num3);