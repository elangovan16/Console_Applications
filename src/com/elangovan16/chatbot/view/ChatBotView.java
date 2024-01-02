package com.elangovan16.chatbot.view;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.elangovan16.chatbot.viewmodel.ChatBotViewModel;

public class ChatBotView {
	private ChatBotViewModel chatBotViewModel;

	public ChatBotView() {
		chatBotViewModel = new ChatBotViewModel(this);
	}

	public void start() throws Exception {
		introduction();
		boolean flag = true;
		int choice;
		Scanner sc = new Scanner(System.in);
		chatBotViewModel.addChat("Press");
		chatBotViewModel.displayCurrentChat("Press");
		do {
			System.out.println("Enter your Option :");
			choice = chatBotViewModel.getInt();
			if (choice == 0) {
				String chat = chatBotViewModel.getCurrentChat();
				if (!chat.equals("Press")) {
					chatBotViewModel.removeCurrentChat();
				}
			} else if (choice == -1) {
				flag = false;
			} else {
				chatBotViewModel.addChatWithCurrentChat(choice);

				String path = chatBotViewModel.getCurrentChat();
				try {
					chatBotViewModel.displayCurrentChat(path);
				} catch (Exception e) {
					showErr("Please Select Correct Number! ");
				}
			}
		} while (flag);
		sc.close();
	}

	public void introduction() {
		System.out.println("+-------------------------+");
		System.out.println("|    Send Instructions    |");
		System.out.println("+-------------------------+");
		System.out.println("| MSI-SND: 9876543210     |");
		System.out.println("| Main Balance: Rs 0.22   |");
		System.out.println("| UL Validity: 13-01-2024 |");
		System.out.println("+-------------------------+");
	}

	public void displayChat(JSONArray jsonArray) {
		for (int i = 0; i < jsonArray.size(); i++) {
			JSONObject object = (JSONObject) jsonArray.get(i);
			System.out.println(object.get(Integer.toString(i)));
		}
	}

	public void showErr(String msg) {
		System.out.println(msg);
	}
}
