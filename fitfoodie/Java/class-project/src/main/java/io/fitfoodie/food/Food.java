package io.fitfoodie.food;

import java.util.List;

public class Food implements Comparable<Food>{
	private String Name;
	private String Restaurant;
	private double ratings;
	public List<Nutrients> nutrients;
	
	public List<Nutrients> getNutrients()
	{
		return nutrients;
	}
	public int compareTo(Food f) {
		return this.Restaurant.compareTo(f.Restaurant);
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public String getRestaurant() {
		return Restaurant;
	}
	
	public void setRestaurant(String restaurant) {
		Restaurant = restaurant;
	}
	
	public double getRatings() {
		return ratings;
	}
	
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	
	public String getId()
	{
		return this.Name;
	}
	public Food(String name, String restaurant, double ratings, List<Nutrients> nutrients) {
		super();
		Name = name;
		Restaurant = restaurant;
		this.ratings = ratings;
		this.nutrients = nutrients;
	}
	
	public Food() {
		
	}
}
