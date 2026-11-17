package com.javaintroduction.methods;

public class LibraraManagementSystem {
	
	public static void displayLibraryName() {
		System.out.println("Welcome to System");
	}
	
	public static void displayLibraryAddress() {
		System.out.println("Address of this is Hyderabad");
	}
	public static void displayLibraryTimings() {
		System.out.println("Timings is 9 to 7");
	}
	
	public static void displayMembershipRules() {
		System.out.println("Pay 5000 per month");
	}
	
	public static void displayAvailableSections() {
		System.out.println("Availability sections");
	}
	
	void displayBookDetails() {
		System.out.println("Book name is Bbook");
		System.out.println("Price is 400");
		System.out.println("Author is Phani");
	}
	
	void borrowBook() {
		System.out.println("You borrowed this book");
	}
	
	void returnBook() {
		System.out.println("You will not able to return the book");
	}
	
	void checkBookAvailability() {
		System.out.println("Sample book is available");
	}
	
	void renewMembership() {
		System.out.println("Renewed your membership automatically");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraraManagementSystem L1=new LibraraManagementSystem();
		
		displayLibraryName();
		displayLibraryAddress();
		displayLibraryTimings();
		displayMembershipRules();
		displayAvailableSections();
		L1.displayBookDetails();
		L1.borrowBook();
		L1.returnBook();
		L1.checkBookAvailability();
		L1.renewMembership();
		

	}

}
