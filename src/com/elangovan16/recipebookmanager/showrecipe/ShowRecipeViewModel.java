package com.elangovan16.recipebookmanager.showrecipe;

import java.util.Map;

import com.elangovan16.recipebookmanager.dto.Recipe;
import com.elangovan16.recipebookmanager.repository.RecipeBookRepository;

public class ShowRecipeViewModel {
	private ShowRecipeView showRecipeView;

	public ShowRecipeViewModel(ShowRecipeView showRecipeView) {
		this.showRecipeView = showRecipeView;
	}

	public Map<String, Recipe> getRecipe() {
		return RecipeBookRepository.getInstance().getRecipe();
	}
}
