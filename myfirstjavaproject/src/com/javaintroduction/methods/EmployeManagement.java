package com.javaintroduction.methods;

public class EmployeManagement {
	
	public static void displayCompanyName() {
		System.out.println("Welcome to TCS ");
	}
	
	void displayEmployeeDetails() {
		System.out.println("Employee name is NTR");
		System.out.println("ID 1234");
		System.out.println("Branch is Web developers");
	}
	
	public static void displayOfficeTimmings() {
		System.out.println("Office Timmings is 9:00 AM to 6:00 PM");
	}

	void calculateWorkingHours() {
		System.out.println("Working Hours per day is 8");
	}
	
	public static void displayHrContact() {
		System.out.println("Contact number 1234567898");
		System.out.println("Email is Priya123@@@@gmail.com");
	}
	 void applyForLeave() {
		 System.out.println("Leave application Message send Successfully");
	 }
	 
	 public static void displayCompanyPolicies() {
		 System.out.println("Attendance is Important");
		 System.out.println("Dress code is Mandatory");
		 System.out.println("Employee discipline is mandatory");
	 }
	 
	 void markAttendance() {
		 System.out.println("Attendance is marked successfylly today date is 12-11-26");
	 }
	 
	 public static void displayHolidayList() {
		 System.out.println("12-10-26 is Holiday for Festival");
		 System.out.println("10-4-26 is Holiday");
		 System.out.println("30-5-26 is Holiday");
	 }
	 
	 void genertaeEmployeeIdCard() {
		 System.out.println("Employee ID Card is Generated Successfully");
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeManagement E1 = new EmployeManagement();
		
		displayCompanyName();
		E1.displayEmployeeDetails();
		displayOfficeTimmings();
		E1.calculateWorkingHours();
		displayHrContact();
		E1.applyForLeave();
		displayCompanyPolicies();
		E1.markAttendance();
		displayHolidayList();
		E1.genertaeEmployeeIdCard();
		
	}

}
