package com.tcs.SpringDemo;

public class Address {
	
	
	private Integer addId;
	private String street;
	private String city;
	public Integer getAddId() {
		return addId;
	}
	public void setAddId(Integer addId) {
		this.addId = addId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [addId=" + addId + ", street=" + street + ", city=" + city + "]";
	}
	

}
