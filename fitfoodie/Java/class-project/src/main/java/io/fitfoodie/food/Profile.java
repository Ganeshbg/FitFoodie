package io.fitfoodie.food;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.ArrayList;
import java.util.Arrays;

@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="@class")
public class Profile {

	
	
	private DietType diet;
	private String id;
	//private Nutrient nutrients [];
	private List<Nutrient> nutrients = new ArrayList<>(Arrays.asList());
	
	
	public DietType getDiet() {
		return diet;
	}
	public void setDiet(DietType diet) {
		this.diet = diet;
	}
	public List<Nutrient> getNutrients() {
		return nutrients;
	}
	public void setNutrients(List<Nutrient> nutrients) {
		this.nutrients = nutrients;
	}
		
	public boolean deleteProfile(){
		
		return true;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
