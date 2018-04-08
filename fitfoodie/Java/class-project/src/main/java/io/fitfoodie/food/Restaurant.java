package io.fitfoodie.food;

public class Restaurant {
	private int id;
	private String name;
	private String address;
	private double rating;
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public Restaurant(int id, String name, String address, double rating) {
		super();
		setId(id);
		setName(name);
		setAddress(address);
		setRating(rating);
	}
}
