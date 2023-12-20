package com.elangovan16.chatbot;

import java.util.Scanner;

public class ChatBot {
	public static void main(String[] args) {
		ChatBot chatBot = new ChatBot();
		chatBot.start();
	}

	private void start() {
		boolean flag = true;
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your Option :");
			choice = sc.nextInt();
			switch (choice) {
			case 0 -> {
				
			}
			case -1 -> {
				flag = false;
			}
			default -> {
				
			}
			}
		} while (flag);
		sc.close();
	}
}
