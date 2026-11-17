package com.javaintroduction.methods;

import java.util.Scanner;

public class DemoMethods {

	Scanner sc = new Scanner(System.in);

	/// no return type without parameters

	void getSalaryDetails() {
		System.out.println("My salary is 150000");
	}

	static void pubEntryfee() {
		System.out.println("your entry fees is 2000");
	}
	void hackthonFee() {
		System.out.println("entry fees is just 100 only");
	}

	/// no return type with parameters

	void houseRent(double rent) {
		System.out.println("Rent is " + rent);
	}
	void totalPubEntries(String count) {
		System.out.println("Total Men entry : ");
		int men=sc.nextInt();
		System.out.println("Total Women entry :");
		int women=sc.nextInt();
		System.out.println("Total couple entries : ");
		int couple=sc.nextInt();
		int total=men+women+couple;
		System.out.println("Total entries of the day :"+total);
	}

	// return type without parameters

	double foodCoupon() {
		System.out.println("Enter coupoun code :");
		double coupon = sc.nextDouble();
		return coupon;
	}
	double todayExpenses() {
		System.out.println("enter your biryani cost : ");
		double bir=sc.nextDouble();
		System.out.println("enter the tea cost : ");
		double tea=sc.nextDouble();
		System.out.println("enter metro charges :");
		double metro=sc.nextDouble();
		double myTotalExpenses=bir+tea+metro;
		System.out.println("TODAY EXPENSES : "+myTotalExpenses);
		return myTotalExpenses;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DemoMethods D1 = new DemoMethods();
		D1.todayExpenses();
		D1.totalPubEntries("0");
		pubEntryfee();
		D1.hackthonFee();

		D1.getSalaryDetails();
		D1.houseRent(300);
		double d = D1.foodCoupon();
		System.out.println("Your coupon code is " + d);

		double total = d;

		System.out.println("Enter Your Rent :");
		double rent = sc.nextDouble();
		D1.houseRent(rent);

	}
}
