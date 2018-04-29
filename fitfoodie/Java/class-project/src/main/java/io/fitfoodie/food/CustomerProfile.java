package io.fitfoodie.food;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="@class")

public class CustomerProfile extends Profile{
	
	
	public void updateProfileNutrient(Nutrients n){
		
	}

}
