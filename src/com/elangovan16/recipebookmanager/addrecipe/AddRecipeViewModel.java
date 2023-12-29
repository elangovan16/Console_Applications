package com.elangovan16.recipebookmanager.addrecipe;

import java.util.List;

import com.elangovan16.recipebookmanager.dto.Recipe;
import com.elangovan16.recipebookmanager.repository.RecipeBookRepository;

public class AddRecipeViewModel {
	private AddRecipeView addRecipeView;

	public AddRecipeViewModel(AddRecipeView addRecipeView) {
		this.addRecipeView = addRecipeView;
	}

	public void validateRecipe(String name, List<String> ingredients, List<String> instructions) {
		Recipe newRecipe = new Recipe(name, ingredients, instructions);
		RecipeBookRepository.getInstance().addRecipe(newRecipe);
		addRecipeView.onSuccess();
	}

	public void defaultLoad() {
		
	}
}
