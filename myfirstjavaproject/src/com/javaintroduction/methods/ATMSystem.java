package com.javaintroduction.methods;

public class ATMSystem {
	
	public static void displayWelcomeMessage() {
		System.out.println("Welcome to SBI ATM");
	}
	
	void checkBalance() {
		System.out.println("Your Balance is 45000");
	}
	
	public static void displayBankDetails() {
		System.out.println("Bank is SBI");
		System.out.println("Branch is Hyderabad");
		System.out.println("IFSC Code is 147788967t");
	}
	
	void withdraw() {
		System.out.println("Successfully withdraw 5000");
	}
	void deposite() {
		System.out.println("Successfully deposited 10000");
	}
	
	public static void bankWorkingHours() {
		System.out.println("24 Hours servicing");
	}
	
	void printMiniStatement() {
		System.out.println("Last transaction is 5000");
		System.out.println("Last transaction is 10000");
		System.out.println("Last transaction is 1000");
	}
	
	void verifyCard() {
		System.out.println("Your Card is verified successfully");
	}
	
	public static void customerSupport() {
		System.out.println("Customer support number is 1800000000");
		System.out.println("24/7 support are available");
	}
	
	void ejectCard() {
		System.out.println("Remove your card");
	}
	
	public static void atmAddress() {
		System.out.println("Location KPHB");
		System.out.println("City is Hyderbad");
		System.out.println("State is Telangana");
	}
	
	void changePin() {
		System.out.println("Old pin changed");
		System.out.println("New pin Generated");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATMSystem A = new ATMSystem();
		
		displayWelcomeMessage();
		A.checkBalance();
		displayBankDetails();
		A.withdraw();
		A.deposite();
		bankWorkingHours();
		A.printMiniStatement();
		A.verifyCard();
		customerSupport();
		A.ejectCard();
		atmAddress();
		A.changePin();

	}

}
