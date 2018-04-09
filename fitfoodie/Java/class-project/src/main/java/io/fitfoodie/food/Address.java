package io.fitfoodie.food;

import org.springframework.beans.factory.annotation.Autowired;

public class Address {
//	
//	private String street;
//	private String city;
//	private String state;
//	private String country;
//	private int zip;
//	
//	public String getStreet() {
//		return street;
//	}
//	public void setStreet(String street) {
//		this.street = street;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//	public String getState() {
//		return state;
//	}
//	public void setState(String state) {
//		this.state = state;
//	}
//	public String getCountry() {
//		return country;
//	}
//	public void setCountry(String country) {
//		this.country = country;
//	}
//	public int getZip() {
//		return zip;
//	}
//	public void setZip(int zip) {
//		this.zip = zip;
//	}

//	public Address(String street, String city, String state, String country, int zip) {
//		super();
//		setStreet(street);
//		setCity(city);
//		setState(state);
//		setCountry(country);
//		setZip(zip);
//	}
	
	
	//private static int id;
	private String unitNumber;
	private String street;
	
//	@Autowired
//	private AreaService areaService;
	private Area area;
	
	public Address(String unitNumber, String street,Area area) {
		super();
		this.unitNumber = unitNumber;
		this.street = street;
		this.area = area;
		//Address.id += 1;
	}
	
	public Address()
	{
		
	}

	public String getUnitNumber() {
		return unitNumber;
	}

	public void setUnitNumber(String unitNumber) {
		this.unitNumber = unitNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}
	
	
	
	
	
}
