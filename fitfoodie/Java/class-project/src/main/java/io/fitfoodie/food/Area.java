package io.fitfoodie.food;

import org.springframework.beans.factory.annotation.Autowired;

//import javax.persistence.Entity;
//import javax.persistence.Id;

//@Entity
public class Area {
	//@Id
	
	@Autowired
	private AreaService areaService;
	
	private String zipCode;
	private String name;
	private String state;
	private String country;

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public Area() {
		
	}

	public Area(String zipCode, String name, String state, String country) {
		super();
		
		this.zipCode = zipCode;
		this.name = name;
		this.state = state;
		this.country = country;
	}
	
}
