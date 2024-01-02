package com.elangovan16.chatbot.repository;

import java.io.FileReader;
import java.util.Stack;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ChatBotRepository {
	Stack<String> backStack = new Stack<String>();
	private static ChatBotRepository repository;

	private ChatBotRepository() {

	}

	public static ChatBotRepository getInstance() {
		if (repository == null) {
			repository = new ChatBotRepository();
		}
		return repository;
	}

	public void addToStack(String path) {
		backStack.add(path);
	}

	public String getCurrentPath() {
		return backStack.peek();
	}

	public String getCurrentChat() {
		return backStack.peek();
	}

	public JSONArray parse(String path) throws Exception {
		JSONParser parser = new JSONParser();
		JSONObject obj = (JSONObject) parser.parse(new FileReader("src/com/elangovan16/chatbot/repository/data.json"));
		return (JSONArray) obj.get(path);
	}

	public void removeCurrnetChat() {
		backStack.pop();
	}
}
