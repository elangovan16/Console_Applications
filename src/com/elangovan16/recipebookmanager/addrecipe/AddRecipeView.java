package com.elangovan16.recipebookmanager.addrecipe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddRecipeView {
	Scanner sc = new Scanner(System.in);
	private AddRecipeViewModel addRecipeViewModel;

	public AddRecipeView() {
		addRecipeViewModel = new AddRecipeViewModel(this);
	}

	public void addNewRecipe() {
		List<String> ingredients = new ArrayList<>();
		List<String> instructions = new ArrayList<>();
		System.out.println("Enter Recipe Name : ");
		String name = sc.nextLine();
		System.out.print("How Many Ingredients have Your Recipe : ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the " + (i + 1) + " Ingredient with unit(eg-10kg) : ");
			String ingredient = sc.nextLine();
			ingredients.add(ingredient);
		}

		System.out.print("How Many instructions do you add : ");
		n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the " + (i + 1) + " instruction : ");
			String instruction = sc.nextLine();
			instructions.add(instruction);
		}
		addRecipeViewModel.validateRecipe(name, ingredients, instructions);
	}

	public void onSuccess() {
		System.out.println("Added Successfully\n");
	}
}
