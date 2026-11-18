package com.javaintroduction.methods;

import java.util.Scanner;

public class MixedMethods3 {

	static Scanner sc = new Scanner(System.in);

	static void displayTheatreName() {
		System.out.println("Threatre name is AMB");
		System.out.println("**************************************");

	}

	void displayMovieDetails() {
		System.out.println("Enter movie name :");
		String name = sc.nextLine();
		System.out.println("Your movie name is " + name);
		System.out.println("**************************************");

		System.out.println("Enter show timings :");
		double time = sc.nextDouble();
		System.out.println("your show timings is " + time);
		System.out.println("**************************************");

	}

	static void showAvailableFacilities() {
		System.out.println("Theatre have Dolby atmos Sound");
	}

	void displaySeatStatus() {
		System.out.println("Enter availabilty show :");
		String show = sc.nextLine();
		System.out.println("Show availability timings :" + show);
		System.out.println("**************************************");

		System.out.println("Enter booked seats :");
		String seat = sc.nextLine();
		System.out.println("Your " + seat + " are booked");
	}

	void bookTickets(String seats) {
		System.out.println("Your selected seats are " + seats);
		System.out.println("**************************************");
	}

	static void calculateTicketAmount(int seats, double price) {
		double total = seats * price;
		System.out.println("Total ticket amount is " + total);
	}

	void displaySnackOrder(String snackName, int quantity) {
		System.out.println("Snack name is " + snackName);
		System.out.println("The quantity of the snack is " + quantity);
	}

	int getAvailableSeats() {
		System.out.println("Enter the seats :");
		int seat = sc.nextInt();
		System.out.println("Enter available seats :");
		int ava = sc.nextInt();
		int total = ava - seat;
		System.out.println("Total available seats are " + total);
		return total;
	}

	String getMovieName() {
		System.out.println("Enter movie name :");
		sc.nextLine();
		String MName = sc.nextLine();
		System.out.println("Movie name is " + MName);
		return MName;
	}

	double getTotalRevenue() {
		System.out.println("Enter booking seats :");
		double seats = sc.nextDouble();
		System.out.println("Enter revenue per ticket :");
		double rev = sc.nextDouble();
		double revenue = seats * rev;
		System.out.println("Total revenue is " + revenue);
		return revenue;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MixedMethods3 M3 = new MixedMethods3();

		displayTheatreName();
		M3.displayMovieDetails();

		System.out.println("Enter selected seats :");
		sc.nextLine();
		String seats = sc.nextLine();
		M3.bookTickets(seats);

		System.out.println("Enter no.of tickets :");
		int tickets = sc.nextInt();
		System.out.println("Enter amount of per tickets :");
		double price = sc.nextDouble();
		System.out.println("**************************************");
		M3.calculateTicketAmount(tickets, price);

		System.out.println("Enter the snack name :");
		sc.nextLine();
		String snack = sc.nextLine();
		System.out.println("Enter how much quantity :");
		int qut = sc.nextInt();
		System.out.println("**************************************");
		M3.displaySnackOrder(snack, qut);

		System.out.println("**************************************");
		M3.getAvailableSeats();

		System.out.println("**************************************");
		M3.getMovieName();

		System.out.println("**************************************");
		M3.getTotalRevenue();

	}

}
