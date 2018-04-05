package io.fitfoodie.food;

public class Food {
	private String Name;
	private String Restaurant;
	private double ratings;
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
	public Food(String name, String restaurant, double ratings) {
		super();
		Name = name;
		Restaurant = restaurant;
		this.ratings = ratings;
	}
	
	public Food() {
		
	}
}

