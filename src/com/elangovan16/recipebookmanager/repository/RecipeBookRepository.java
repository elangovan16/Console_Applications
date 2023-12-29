package com.elangovan16.recipebookmanager.repository;

import java.util.HashMap;
import java.util.Map;
import com.elangovan16.recipebookmanager.dto.Recipe;

public class RecipeBookRepository {
	private static RecipeBookRepository repository;
	Map<String, Recipe> recipes = new HashMap<>();

	private RecipeBookRepository() {

	}

	public static RecipeBookRepository getInstance() {
		if (repository == null) {
			repository = new RecipeBookRepository();
		}
		return repository;
	}

	public void addRecipe(Recipe recipe) {
		recipes.put(recipe.getName(), recipe);
	}

	public boolean removeRecipe(String name) {
		if (recipes.containsKey(name)) {
			recipes.remove(name);
			return true;
		} else {
			return false;
		}
	}

	public Map<String, Recipe> getRecipe() {
		return recipes;
	}
}
