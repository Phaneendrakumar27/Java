package com.javaintroduction.methods;

import java.util.Scanner;

public class MixedMethods2 {

	static Scanner sc = new Scanner(System.in);

	static void displaySystemStatus() {
		System.out.println("Smart Home is ready");
	}

	void turnOnLights() {
		System.out.println("The lights are turned on");
	}

	static void showAvailableDevices() {
		System.out.println("Available devices are lights,fans,washing maching");
	}

	void displayRoomDetails() {
		System.out.println("The room is 3rd room");
		System.out.println("Temperature is 24 degrees celsius");
	}

	void setTemperature(int temp) {
		System.out.println("The current temperature is " + temp);
	}

	void controlFan(String mode, int speed) {
		System.out.println("Fan mode is " + mode);
		System.out.println(speed + " is the speed");
	}

	int getCurrentTemperature() {
		System.out.println("Enter temperature :");
		int tem = sc.nextInt();
		System.out.println("Your temperature is :"+tem);
		return tem;
	}

	double electricityRate() {
		System.out.println("Enter electricity rate :");
		double ele = sc.nextDouble();
		System.out.println("Your electricity rate is :"+ele);
		return ele;
	}

	boolean acRunning() {
		System.out.println("Enter running status :");
		boolean running = sc.nextBoolean();
		System.out.println("Your ac running status is :"+running);
		return running;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MixedMethods2 M2 = new MixedMethods2();

		displaySystemStatus();
		M2.turnOnLights();
		showAvailableDevices();
		M2.displayRoomDetails();

		System.out.println("Enter temperature :");
		int temp = sc.nextInt();
		M2.setTemperature(temp);

		System.out.println("Enter mode of fan :");
		sc.nextLine();
		String mode = sc.nextLine();
		System.out.println("Enter speed of the fan :");
		int speed = sc.nextInt();
		M2.controlFan(mode, speed);
		M2.getCurrentTemperature();
		M2.electricityRate();
		M2.acRunning();
		

	}

}
