package com.skilldistillery.foodtruck.app;

public class FoodTruck {
	private String name;
	private int rating;
	private String food;
	private int UID = 0;
	private static int nextFoodTruckId = 1;
	
	public FoodTruck() {
		this.UID = nextFoodTruckId;
		nextFoodTruckId++;
	}

	public FoodTruck(String name, int rating, String food) {
		this();
		this.name = name;
		this.rating = rating;
		this.food = food;
		
	}
	
	//methods
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getUID() {
		return UID;
	}

	public void setUID(int uID) {
		UID = uID;
	}
	
	public String getFoodTruckData() {
		String output = "name=" + name + ", rating=" + rating
				+ ", UID=" + UID;
		return output;
	}

	public void displayFoodTruck() {
		String foodTruckData = this.toString();
		System.out.println(foodTruckData);
	}
	@Override
	public String toString() {
		return "FoodTruck [name=" + name + ", rating=" + rating
				+ ", UID=" + UID + "]";
	}


}
