package io.fitfoodie.food;

import java.util.List;

public class Meal implements Comparable<Meal>{
	private String Name;
	private Restaurant Restaurant;
	private int calories;
	private double price;
	public List<Nutrients> nutrients;
	
	
	public int compareTo(Meal f) {
		return this.Restaurant.getName().compareTo(f.Restaurant.getName());
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
	
	public Restaurant getRestaurant() {
		return Restaurant;
	}
	
	public void setRestaurant(Restaurant restaurant) {
		Restaurant = restaurant;
	}
	
	public String getId()
	{
		return this.Name;
	}
	public Meal(String name, Restaurant restaurant, int calories, double price, List<Nutrients> nutrients) {
		super();
		setName(name);
		setRestaurant(restaurant);
		setCalories(calories);
		setPrice(price);
		setNutrients(nutrients);
		
	}
	
	public Meal() {
		
	}
}
