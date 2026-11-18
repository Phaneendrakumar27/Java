package com.constructors;

public class RailwayBooking {
	
	String name;
	int trainNumber;
	String destination;
	double ticketPrice;
	int seatNumber;
	
	
	RailwayBooking(){
		System.out.println("No-args");	
		name="P";
		trainNumber=12345;
		destination="Hyderabad";
		ticketPrice=80.0;
		seatNumber=4;
	}
	
	RailwayBooking(String name){
		System.out.println("Paramerterized constructor");
		this.name=name;
	}
	
	RailwayBooking(String name,int trainNumber){
		System.out.println("Paramerterized constructor");
		this.name=name;
		this.trainNumber=trainNumber;
	}
	
	RailwayBooking(String name,int trainNumber,String destination){
		System.out.println("Paramerterized constructor");
		this.name=name;
		this.trainNumber=trainNumber;
		this.destination=destination;
	}
	
	RailwayBooking(String name,int trainNumber,String destination,double ticketPrice){
		System.out.println("Paramerterized constructor");
		this.name=name;
		this.trainNumber=trainNumber;
		this.destination=destination;
		this.ticketPrice=ticketPrice;
	}
	
	RailwayBooking(String name,int trainNumber,String destination,double ticketPrice,int seatNumber){
		System.out.println("Paramerterized constructor");
		this.name=name;
		this.trainNumber=trainNumber;
		this.destination=destination;
		this.ticketPrice=ticketPrice;
		this.seatNumber=seatNumber;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RailwayBooking B1=new RailwayBooking();
		System.out.println(B1.name);
		System.out.println(B1.trainNumber);
		System.out.println("*************************************");

		
		RailwayBooking B2=new RailwayBooking();
		B2.name="Phani";
		System.out.println(B2.name);
		System.out.println("*************************************");
		
		RailwayBooking B3=new RailwayBooking("Pandi1",56789,"Bangalore");
		System.out.println("Passenger name is "+B3.name);
		System.out.println("Train number "+B3.trainNumber);
		System.out.println("Destination is "+B3.destination);
		System.out.println("*************************************");
		
		RailwayBooking B4=new RailwayBooking("Pandi2",12378,"Chennai",100);
		System.out.println("Passenger name is "+B4.name);
		System.out.println("Train number "+B4.trainNumber);
		System.out.println("Destination is "+B4.destination);
		System.out.println("Price of ticket "+B4.ticketPrice);
		System.out.println("*************************************");
		
		RailwayBooking B5=new RailwayBooking("Pandi3",14650,"Delhi",560,5);
		System.out.println("Passenger name is "+B5.name);
		System.out.println("Train number "+B5.trainNumber);
		System.out.println("Destination is "+B5.destination);
		System.out.println("Price of ticket "+B5.ticketPrice);
		System.out.println("Price of ticket "+B5.seatNumber);

		System.out.println("*************************************");











	}

}
