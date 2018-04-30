package io.fitfoodie.food;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use=JsonTypeInfo.Id.CLASS, include=JsonTypeInfo.As.PROPERTY, property="@class")
public interface Nutrients {

	public abstract int getQuantity();
	
	public abstract String getName() ;
	
}
