package com.javaintroduction.methods;

import java.util.Scanner;

public class Methods2 {
	
	void addition(int a,int b) {
		System.out.println("The sum of two numbers : "+ (a+b));
	}
	
	void subtraction(int a,int b) {
		System.out.println("The subtraction of two numbers : "+(a-b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods2 m1 = new Methods2();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter input a : ");
		int input1=sc.nextInt();
		System.out.println("Enter input b : ");
		int input2 =sc.nextInt();
		m1.addition(input1,input2);
		
		System.out.println("Enter input a :");
		int sub1=sc.nextInt();
		System.out.println("Enter input b :");
		int sub2=sc.nextInt();
		m1.subtraction(sub1, sub2);
		

	}

}
