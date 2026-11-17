package com.javaintroduction.methods;

public class HospitalManagementSystem {
	
	public static void displayHospitalName() {
		System.out.println("Hospital name is KISS");
	}
	
	public static void displayHospitalAddress() {
		System.out.println("Address is ameerpet");
	}
	
	public static void displayHospitalTimings() {
		System.out.println("Timings is 24/7 is available");
	}
	
	public static void displayEmergencyContact() {
		System.out.println("Emergence contack is 18000000");
	}
	
	public static void displayAvailableDepartments() {
		System.out.println("Neurology,Orthopedic,Dentist,Cardiology");
	}
	
	void displayPatientDetails() {
		System.out.println("Patient name is $$$$$");
	}
	
	void bookAppointment() {
		System.out.println("Your appointment is Confirmed");
	}
	
	void checkDoctorAvailability() {
		System.out.println("Doctor available in tuesdays only");
	}
	
	void displayMedicalReport() {
		System.out.println("All are Amazing");
	}
	
	void cancelAppointment() {
		System.out.println("You cancled your appointment,cancilation successful");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HospitalManagementSystem H1 = new HospitalManagementSystem();
		displayHospitalName();
		displayHospitalAddress();
		displayHospitalTimings();
		displayEmergencyContact();
		displayAvailableDepartments();
		H1.displayPatientDetails();
		H1.bookAppointment();
		H1.checkDoctorAvailability();
		H1.displayMedicalReport();
		H1.cancelAppointment();

	}

}
