package com.webapp.MealPlanner.Spoonacular;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.webapp.MealPlanner.dto.SpoonacularDayResponse;
import com.webapp.MealPlanner.dto.SpoonacularWeekResponse;

public class SpoonacularApiIntegration {
	
	@Value("${spoonacular.urls.base}")
	private String baseURL;
	
	
	@Value("${spoonacular.urls.mealplan}")
	private String generateMealURL;
	
	
	
	@Value("${spoonacular.api.key}")
	private String apiKey;
	

	public ResponseEntity<SpoonacularDayResponse> generateMealPlanByDay(String timeFrame,
								String numCalories, 
								String diet, 
								String exclusions
								) {

	
		 String mealPlanURL = baseURL + generateMealURL;
		
	RestTemplate restTemplate = new RestTemplate();
	
	 MultiValueMap<String, String> queryparams = new LinkedMultiValueMap<>();
	
	URI uri  = null;
	
	System.out.println("numCalories :"+ numCalories);
	System.out.println("diet :"+ diet);
	System.out.println("exclusions :"+ exclusions);
	
	if(numCalories != null) {
		queryparams.set("targetCalories",numCalories );
	}
	if(diet != null) {
		queryparams.set("diet",diet );
	}
	if(exclusions != null) {
		queryparams.set("exclude",exclusions );
	}
	
	System.out.println("query param size :"+ queryparams.size());
	
	if(queryparams.size()!= 0) {
		
		 uri = UriComponentsBuilder.fromHttpUrl(mealPlanURL)
                .queryParam("apiKey", apiKey)
                .queryParam("timeFrame", timeFrame)
                .queryParams((MultiValueMap<String, String>) queryparams)
                .build().toUri();


		
	}
	else {
		 uri = UriComponentsBuilder.fromHttpUrl(mealPlanURL)
                .queryParam("apiKey", apiKey)
                .queryParam("timeFrame", timeFrame)
                .build().toUri();


	}
	

	  System.out.println(uri.toString());
	
		
		ResponseEntity<SpoonacularDayResponse> mealPlannerResponseDay = restTemplate.getForEntity(uri, SpoonacularDayResponse.class);
		System.out.println(mealPlannerResponseDay.getBody());
		
		
		return mealPlannerResponseDay;
	}
	

public ResponseEntity<SpoonacularWeekResponse> generateMealPlanByWeek(String timeFrame,
		String numCalories, 
		String diet, 
		String exclusions) {

	 String mealPlanURL = baseURL + generateMealURL;
	
	
	RestTemplate restTemplate = new RestTemplate();
	
	 MultiValueMap<String, String> queryparams = new LinkedMultiValueMap<>();
	
	URI uri  = null;
	
	System.out.println("numCalories :"+ numCalories);
	System.out.println("diet :"+ diet);
	System.out.println("exclusions :"+ exclusions);
	
	if(numCalories != null) {
		queryparams.set("targetCalories",numCalories );
	}
	if(diet != null) {
		queryparams.set("diet",diet );
	}
	if(exclusions != null) {
		queryparams.set("exclude",exclusions );
	}
	
	System.out.println("query param size :"+ queryparams.size());
	
	System.out.println("URL Path"+mealPlanURL);
	
	if(queryparams.size()!= 0) {
		
		 uri = UriComponentsBuilder.fromHttpUrl(mealPlanURL)
               .queryParam("apiKey", apiKey)
               .queryParam("timeFrame", timeFrame)
               .queryParams((MultiValueMap<String, String>) queryparams)
               .build().toUri();


		
	}
	else {
		 uri = UriComponentsBuilder.fromHttpUrl(mealPlanURL)
               .queryParam("apiKey", apiKey)
               .queryParam("timeFrame", timeFrame)
               .build().toUri();


	}
	

	  System.out.println(uri.toString());
	
		
		ResponseEntity<SpoonacularWeekResponse> mealPlannerResponseWeek = restTemplate.getForEntity(uri,SpoonacularWeekResponse.class);
		System.out.println(mealPlannerResponseWeek.getBody());
		
		
		return mealPlannerResponseWeek;
	
	
		
	}
	
		                      


}
