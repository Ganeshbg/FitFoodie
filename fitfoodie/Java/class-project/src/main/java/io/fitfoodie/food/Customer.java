package io.fitfoodie.food;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="@class")
public class Customer extends RegisteredUser implements SearchableByProfile{
	
	//private List<Nutrient> profile = new ArrayList<>(Arrays.asList(	));
	private List<Profile> profiles= new ArrayList<>(Arrays.asList());
	private ShoppingCart cart;
	
	
	public Customer(String name, ArrayList nutrients, String id) {
		super.setName(name);
		Profile p=new CustomerProfile();
		p.setId(id);
		p.setNutrients(nutrients);
		this.profiles.add(p);
	}
	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}
	@Override
	public Account getAccount() {
		// TODO Auto-generated method stub
		return super.getAccount();
	}
	@Override
	public void setAccount(Account acc) {
		// TODO Auto-generated method stub
		super.setAccount(acc);
	}
	
	
	
	
	
	public ShoppingCart getCart() {
		return cart;
	}
	public void setCart(ShoppingCart cart) {
		this.cart = cart;
	}
	
	public Restaurant [] searchMealOnProfile(Profile p){
		
		return null;
	}
	public List<Profile> getProfile() {
		return profiles;
	}
	public void setProfile(List<Profile> profiles) {
		this.profiles=profiles;
	}
	public void addProfile(Profile p) {
		this.profiles.add(p);
	}


	public void updateProfile(int index, Profile p) {
		this.profiles.set(index, p);
		
	}
}
