package com.javaintroduction.methods;

import java.util.Scanner;

public class TestDemoMethods2 {
	
	static void addition(double a,double b) {
		System.out.println("Addition method called");
		System.out.println("The Sum of two numbers is "+ (a+b));
		System.out.println("*****************************************");

	}
	
	void subtraction(double a,double b) {
		System.out.println("Subtraction method called");
		System.out.println("The subtraction of two num is "+ (a-b));
		System.out.println("*****************************************");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestDemoMethods2 T1=new TestDemoMethods2();
		
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a value :");
		double a= sc.nextDouble();
		System.out.println("Enter b value :");
		double b=sc.nextDouble();
		
		addition(a,b);
		
		System.out.println("Enter a value :");
		double a1=sc.nextDouble();
		System.out.println("Enter b value :");
		double b1=sc.nextDouble();
		
		// methods calling area
		//addition(a,b);
		T1.subtraction(a1,b1);
		
		System.out.println("main method ended");

	}

}
