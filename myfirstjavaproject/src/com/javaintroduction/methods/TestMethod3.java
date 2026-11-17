package com.javaintroduction.methods;

import java.util.Scanner;

public class TestMethod3 {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMethod3 T1=new TestMethod3();
		double bs=T1.basicSalary();
		double hra=T1.houseRentAllo();
		double h1=T1.healthCare();
		
		double total_salary=bs+hra+h1;
		System.out.println("Your total Salary :"+total_salary);

	}
	
	double basicSalary() {
		System.out.println("Enter Your Basic Salary :");
		double basic=sc.nextDouble();
		return basic;
	}
	
	double houseRentAllo() {
		System.out.println("Enter your hra :");
		double hra=sc.nextDouble();
		return hra;
		
	}
	double healthCare() {
		System.out.println("enter your health care amount :");
		double health=sc.nextDouble();
		return health;
		
	}

}
