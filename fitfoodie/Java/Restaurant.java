
public class Restaurant {
	private int id;
	private String name;
	private Meal[] meals;
	private Address address;
	private double rating;
	private Cuisine cuisine;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Meal[] getMeals() {
		return meals;
	}
	public void setMeals(Meal[] meals) {
		this.meals = meals;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public Cuisine getCuisine() {
		return cuisine;
	}
	public void setCuisine(Cuisine cuisine) {
		this.cuisine = cuisine;
	}
}
