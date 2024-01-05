package com.elangovan16.chatbot.viewmodel;

import java.util.Scanner;

import org.json.simple.JSONArray;

import com.elangovan16.chatbot.repository.ChatBotRepository;
import com.elangovan16.chatbot.view.ChatBotView;

public class ChatBotViewModel {
	Scanner sc = new Scanner(System.in);
	private ChatBotView chatBotView;

	public ChatBotViewModel(ChatBotView chatBotView) {
		this.chatBotView = chatBotView;
	}

	public void addChat(String string) {
		ChatBotRepository.getInstance().addToStack(string);
	}

	public void addChatWithCurrentChat(int n) {
		String path = getCurrentChat();
		addChat(path + "_" + (n - 1));
	}

	public String getCurrentChat() {
		return ChatBotRepository.getInstance().getCurrentChat();
	}

	public void removeCurrentChat() {
		ChatBotRepository.getInstance().removeCurrnetChat();
	}

	public void displayCurrentChat(String string) throws Exception {
		JSONArray jsonarray = ChatBotRepository.getInstance().parse(string);
		if (jsonarray != null) {
			chatBotView.displayChat(jsonarray);
		}

	}

	public int getInt() {
		int n;
		while (true) {
			if (sc.hasNextInt()) {
				n = sc.nextInt();
				sc.nextLine();
				return n;
			} else {
				sc.nextLine();
				System.out.println("Wrong input");
			}
		}
	}

}
