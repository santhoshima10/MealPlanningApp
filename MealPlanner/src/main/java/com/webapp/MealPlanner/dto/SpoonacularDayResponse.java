package com.webapp.MealPlanner.dto;

public class SpoonacularDayResponse {
	
	private Recipe[] meals ;

	private MealNutrients nutrients;

	public Recipe[] getMeals() {
		return meals;
	}

	public void setMeals(Recipe[] meals) {
		this.meals = meals;
	}
	
	public MealNutrients getNutrients() {
		return nutrients;
	}

	public void setNutrients(MealNutrients nutrients) {
		this.nutrients = nutrients;
	}

}
