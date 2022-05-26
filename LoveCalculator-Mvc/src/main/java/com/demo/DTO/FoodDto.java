package com.demo.DTO;

public class FoodDto {

	private String foodName;

	private String foodCost;

	public FoodDto() {

		System.out.println("Food Info COnstructor");
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getFoodCost() {
		return foodCost;
	}

	public void setFoodCost(String foodCost) {
		this.foodCost = foodCost;
	}

}
