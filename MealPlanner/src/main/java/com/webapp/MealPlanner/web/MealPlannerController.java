package com.webapp.MealPlanner.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.MealPlanner.Spoonacular.SpoonacularApiIntegration;
import com.webapp.MealPlanner.dto.SpoonacularDayResponse;
import com.webapp.MealPlanner.dto.SpoonacularWeekResponse;
import com.webapp.MealPlanner.service.MealPlannerService;

@RestController
public class MealPlannerController {
	
	@Autowired
	private MealPlannerService mealPlannerService;
	
	
	@GetMapping("mealplanner/day")
	public ResponseEntity<SpoonacularDayResponse> getMealPlannerByDay(
			@RequestParam(required = false) String numCalories, 
			@RequestParam(required = false) String diet, 
			@RequestParam(required = false) String exclusions) {
		
		return mealPlannerService.getMealPlannerByDay(numCalories, diet, exclusions);
		
	}
	
	
	@GetMapping("mealplanner/week")
	public ResponseEntity<SpoonacularWeekResponse> getWeekMeals(
			@RequestParam(required = false) String numCalories, 
			@RequestParam(required = false) String diet, 
			@RequestParam(required = false) String exclusions) {
		
		return mealPlannerService.getWeekMeals(numCalories, diet, exclusions);
		
	}
	
	


}
