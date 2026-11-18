package com.javaintroduction.methods;

import java.util.Scanner;

public class MixedMethods {
	
	static Scanner sc= new Scanner(System.in);
	
	static void displayWelcome() {
		System.out.println("Welcome to Travelling");
	}
	
	void destination() {
		System.out.println("Your destination is Hyderabad");
	}
	
	static void travelTrips() {
		System.out.println("4 free trips you have");
	}
	
	void duration() {
		System.out.println("Travel destination is hyd");
		System.out.println("Travel duration is 4 hours");
	}
	
	void totalPrice(int persons,double price) {
		double total=persons * price;
		System.out.println("Total Price is "+total);
	}
	
	void bookingDays(String hotelName,int days) {
		System.out.println("Hotel name is "+hotelName);
		System.out.println("Your booking days "+days);
	}
	static void details(String city,String country) {
		System.out.println("Your city is "+city);
		System.out.println("Country is "+country);
	}
	
	double tripCost() {
		System.out.println("Enter total ticket expenses :");
		double cost=sc.nextDouble();
		System.out.println("Enter Hotel expenses :");
		double ht=sc.nextDouble();
		double total=cost+ht;
		System.out.println("Trip cost is "+total);
		return total;
	}
	
	String dest() {
		System.out.println("Enter your destination :");
		sc.nextLine();
		String dc=sc.nextLine();
		System.out.println("Your destination is "+dc);
		return dc;
	}
	
	static int days() {
		System.out.println("Enter Recomended days :");
		int days=sc.nextInt();
		System.out.println("Recomended days are "+days);
		return days;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MixedMethods M1=new MixedMethods();
		
		displayWelcome();
		M1.destination();
		travelTrips();
		M1.duration();
		M1.totalPrice(5, 578);
		M1.bookingDays("Avara", 7);
		details("Hyd","India");
		M1.tripCost();
		M1.dest();
		days();
		
		

	}

}
