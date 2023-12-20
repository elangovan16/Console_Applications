package com.elangovan16.chatbot.repository;

public class ChatBotRepository {
	private static ChatBotRepository repository;

	private ChatBotRepository() {
		
	}

	public static ChatBotRepository getInstance() {
		if (repository == null) {
			repository = new ChatBotRepository();
		}
		return repository;
	}
}
