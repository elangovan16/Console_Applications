package com.elangovan16.recipebookmanager.dto;

import java.util.List;

public class Recipe {
	private String name;
	private List<String> ingredient;
	private List<String> instructions;

	public Recipe(String name, List<String> ingredients, List<String> instructions) {
		this.ingredient = ingredients;
		this.name = name;
		this.instructions = instructions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getIngredient() {
		return ingredient;
	}

	public void setIngredient(List<String> ingredient) {
		this.ingredient = ingredient;
	}

	public List<String> getInstructions() {
		return instructions;
	}

	public void setInstructions(List<String> instructions) {
		this.instructions = instructions;
	}
}