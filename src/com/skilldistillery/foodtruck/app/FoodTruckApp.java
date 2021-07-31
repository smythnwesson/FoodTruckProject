package com.skilldistillery.foodtruck.app;

import java.util.Arrays;
import java.util.Scanner;

public class FoodTruckApp {
	private int numFoodTrucks;
	private int MAX_TRUCKS = 5;
	private FoodTruck[] foodTrucks = new FoodTruck[MAX_TRUCKS];
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		FoodTruckApp foodTrucksApp = new FoodTruckApp();
		foodTrucksApp.run();

	}

	public void run() {
		boolean keepGoing = true;
		createFoodTruck();
		do {
			System.out.println("Please select an option from the menu below using 1-4 as an input: \n");
			System.out.println("----------------------------------------");
			System.out.println("1) List all food trucks");
			System.out.println("2) See the average rating of food trucks");
			System.out.println("3) Highest rated food truck");
			System.out.println("4) QUIT");
			System.out.println("----------------------------------------");

			int foodTruckMenu = sc.nextInt();

			switch (foodTruckMenu) {
			case 1:
				allFoodTrucks();
				break;
			case 2:
				System.out.println();
				break;
			case 3:
				System.out.println();
				break;
			case 4:
				System.out.println("Goodbye");
				keepGoing = false;
				break;

			default:
				System.out.println("Input invalid. Please try again.");
			}

		} while (keepGoing);
		sc.close();
	}

	public double averageRating(double avg) {
		return 0.0;
	}

	public void allFoodTrucks() {
		for (FoodTruck foodTruck : foodTrucks) {
			if(foodTruck == null) {
				continue;
			}
			System.out.println(foodTruck);
		}
	}

	public double highestRated() {
		return 0.0;
	}

	public void createFoodTruck() {
		for (int i = 0; i < foodTrucks.length; i++) {

			System.out.println("Please enter a food truck: ");
			String name = sc.nextLine();

			if (name.equalsIgnoreCase("quit")) {
				break;
			}
			System.out.println("Please enter the rating you wish to give the food truck from 1-5, \n"
					+ "1 being the worst 5 being the best: ");
			int rating = sc.nextInt();
			System.out.println();
			
			sc.nextLine();
			
			System.out.println("Please enter the type of food served");
			String food = sc.nextLine();
			FoodTruck foodT = new FoodTruck(name, rating, food);
			foodTrucks [i] = foodT; 
		}
	}

}
