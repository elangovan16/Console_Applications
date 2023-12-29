package com.elangovan16.recipebookmanager.showrecipe;

import java.util.Map;
import java.util.Scanner;

import com.elangovan16.recipebookmanager.dto.Recipe;

public class ShowRecipeView {
	Scanner sc = new Scanner(System.in);
	private ShowRecipeViewModel showRecipeViewModel;

	public ShowRecipeView() {
		showRecipeViewModel = new ShowRecipeViewModel(this);
	}

	public void showRecipe() {
		Map<String, Recipe> recipe = showRecipeViewModel.getRecipe();
		for (String recipeName : recipe.keySet()) {
			System.out.println(recipeName);
		}
		System.out.println("\nEnter recipe Name : ");
		String name = sc.nextLine();

		Recipe reci = recipe.get(name);
		int index = 1;
		System.out.println("Ingredients : ");
		for (String s : reci.getIngredient()) {
			System.out.println(index + " ." + s);
			index++;
		}
		index = 0;
		System.out.println("Instructions : ");
		for (String s : reci.getInstructions()) {
			System.out.println(index + " ." + s);
			index++;
		}
	}
}
