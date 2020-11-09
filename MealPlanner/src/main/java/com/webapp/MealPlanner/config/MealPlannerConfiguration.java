package com.webapp.MealPlanner.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.webapp.MealPlanner.Spoonacular.SpoonacularApiIntegration;
import com.webapp.MealPlanner.dto.MealNutrients;
import com.webapp.MealPlanner.dto.Recipe;
import com.webapp.MealPlanner.dto.SpoonacularDayResponse;
import com.webapp.MealPlanner.dto.SpoonacularWeekResponse;
import com.webapp.MealPlanner.dto.Week;

@Configuration
public class MealPlannerConfiguration {
	
	
 @Bean  
 public SpoonacularDayResponse dayResponse() {
	 return new SpoonacularDayResponse();
 }
 
 
 @Bean  
 public Recipe recipe() {
	 return new Recipe();
 }
 
 @Bean
 public MealNutrients nutrients() {
	 return new MealNutrients();
 }
 
 
 @Bean  
 public SpoonacularWeekResponse weekResponse() {
	 return new SpoonacularWeekResponse();
 }
 
 @Bean  
 public Week weekData() {
	 return new Week();
 }
 
 @Bean
 public SpoonacularApiIntegration apiIntegration() {
	 return new SpoonacularApiIntegration();
 }

}
