package com.hotelapp.model;

public class Hotel {
	String hotelName;
	Integer hotelId;
	String city;
	String cuisine;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel(String hotelName, Integer hotelId, String city, String cuisine) {
		super();
		this.hotelName = hotelName;
		this.hotelId = hotelId;
		this.city = city;
		this.cuisine = cuisine;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public Integer getHotelId() {
		return hotelId;
	}
	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", hotelId=" + hotelId + ", city=" + city + ", cuisine=" + cuisine
				+ "]";
	}
	

}
