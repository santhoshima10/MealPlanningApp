package com.webapp.MealPlanner.dto;

public class Recipe {
	
	private Long id;
	private String imageType;
	private String title;
	private Integer readyInMinutes;
	private Integer servings;
	private String sourceUrl;

	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getImageType() {
		return imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getReadyInMinutes() {
		return readyInMinutes;
	}
	public void setReadyInMinutes(Integer readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}
	public Integer getServings() {
		return servings;
	}
	public void setServings(Integer servings) {
		this.servings = servings;
	}
	public String getSourceUrl() {
		return sourceUrl;
	}
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}
	
}
