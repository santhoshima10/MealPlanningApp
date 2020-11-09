package com.webapp.MealPlanner.dto;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;

public class Week {
	
	private Map<String, SpoonacularDayResponse> weekDays = new LinkedHashMap<>();

	public Map<String, SpoonacularDayResponse> getWeekDays() {
		return weekDays;
	}

	@JsonAnySetter
	public void setWeekDays(String day, SpoonacularDayResponse dayData) {
		this.weekDays.put(day, dayData);
	}
	
   

}
