package com.webapp.MealPlanner.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.webapp.MealPlanner.Spoonacular.SpoonacularApiIntegration;
import com.webapp.MealPlanner.dto.SpoonacularDayResponse;
import com.webapp.MealPlanner.dto.SpoonacularWeekResponse;

//Api Key e42a859af34c4c9fa0103f568b63d155

/*
 * "status": "success",
    "username": "api-59775-demouser",
    "hash": "ec82dbc76a55b1062f30eaa6d523bf57f2d52bba"
 */

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
