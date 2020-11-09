package com.webapp.MealPlanner.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.webapp.MealPlanner.Spoonacular.SpoonacularApiIntegration;
import com.webapp.MealPlanner.dto.SpoonacularDayResponse;
import com.webapp.MealPlanner.dto.SpoonacularWeekResponse;

@Service
public class MealPlannerService {
	
	
	@Autowired
	private SpoonacularApiIntegration spoonacularApiIntegration;
	
	public ResponseEntity<SpoonacularDayResponse> getMealPlannerByDay(String numCalories, 
			 String diet, 
			String exclusions) {
		
		return spoonacularApiIntegration.generateMealPlanByDay("day", numCalories, diet, exclusions);
	}
	
	
	public ResponseEntity<SpoonacularWeekResponse> getWeekMeals(
			 String numCalories, 
			 String diet, 
			 String exclusions) {
		
		return spoonacularApiIntegration.generateMealPlanByWeek("week", numCalories, diet, exclusions);
		
	}

}
