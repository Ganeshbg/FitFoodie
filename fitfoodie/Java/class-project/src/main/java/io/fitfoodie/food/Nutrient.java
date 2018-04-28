package io.fitfoodie.food;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="@class")
public interface Nutrient {

	/*private int protein;
	private int carbohydrates;
	private int fat;*/
	
	public abstract int getQuantity();
	
	public abstract String getName() ;
	
	/*public int getProtein() {
		return protein;
	}
	
	public void setProtein(int protein) {
		this.protein = protein;
	}
	
	public int getCarbohydrates() {
		return carbohydrates;
	}
	
	public void setCarbohydrates(int carbohydrates) {
		this.carbohydrates = carbohydrates;
	}
	
	public int getFat() {
		return fat;
	}
	
	public void setFat(int fat) {
		this.fat = fat;
	}
	*/
	
}
