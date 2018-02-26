package com.makingdevs.demo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
public class Address{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id

	private String street
	private Integer outdoorNumber
	private Integer interiorNumber
	private Integer postCode
	private String neighborhood
	private String state
	private String city
	private String country
}