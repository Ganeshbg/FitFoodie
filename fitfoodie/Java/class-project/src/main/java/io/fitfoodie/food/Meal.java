package io.fitfoodie.food;

import java.util.List;

public class Meal implements Comparable<Food>{
	private String Name;
	private String Restaurant;
	private double ratings;
	private int calories;
	private double price;
	public List<Nutrients> nutrients;
	
	
	public int compareTo(Meal f) {
		return this.Restaurant.compareTo(f.Restaurant);
	}
	
	public int getCalories()
	{
		return calories;
	}
	
	public void setCalories(int calories)
	{
		this.calories = calories;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public List<Nutrients> getNutrients()
	{
		return nutrients;
	}
	
	public void setNutrients(List<Nutrients> nutrients)
	{
		this.nutrients = nutrients;
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
	public Meal(String name, String restaurant, double ratings, int calories, double price, List<Nutrients> nutrients) {
		super();
		setName(name);
		setRestaurant(restaurant);
		setRatings(ratings);
		setCalories(calories);
		setPrice(price);
		setNutrients(nutrients);
		
	}
	
	public Meal() {
		
	}
	@Override
	public int compareTo(Food o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
