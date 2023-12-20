package com.elangovan16.chatbot.optionselect;

import java.util.Stack;

public class OptionSelectView {
	private OptionSelectViewModel optionSelectViewModel;
	Stack<String> backStack = new Stack<String>();

	public OptionSelectView() {
		optionSelectViewModel = new OptionSelectViewModel(this);
	}

	public void introduction() {
		System.out.println("\n---Send Instructions---");
		System.out.println("MSI-SND: 9876543210");
		System.out.println("Main Balance: Rs 0.22");
		System.out.println("UL Validity: 13-01-2024");
		System.out.println("Select Language : \n");
	}
}
