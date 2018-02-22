package com.makingdevs.demo.model

public class Address{
	
	private String street
	private String outdoorNumber
	private String interiorNumber 
	private String postCode
	private String neighborhood
	private String state 
	private String city
	private String country

	public String toString(){
		"""${street} ${outdoorNumber} ${interiorNumber} ${postCode} ${neighborhood} ${state} ${city} ${country} """
	}
}