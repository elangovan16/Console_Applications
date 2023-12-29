package com.elangovan16.busreservation;

import java.util.Scanner;

public class BusReservation {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BusReservation busReservation = new BusReservation();
		busReservation.start();
	}

	private void start() {
		
	}
	private void info() {
		System.out.println("1.Admin");
		System.out.println("2.User");
		System.out.println("0.Exit..");
		System.out.println("Enter your Choice : ");
	}
	private void adminInfo() {
		System.out.println("+-----Admin-----+");
		System.out.println("1.Add Bus");
		System.out.println("2.Remove Bus");
		System.out.println("9.Back");
		System.out.println("0.Exit..");
		System.out.println("Enter your Choice : ");
	}
	private void userInfo() {
		System.out.println("+-----User-----+");
		System.out.println("1.View All Buses");
		System.out.println("2.Book Ticket");
		System.out.println("3.Cancel Ticket");
		System.out.println("9.Back");
		System.out.println("0.Exit..");
		System.out.println("Enter your Choice : ");
	}
}
