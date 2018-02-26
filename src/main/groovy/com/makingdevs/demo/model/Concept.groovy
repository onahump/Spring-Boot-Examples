package com.makingdevs.demo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
public class Concept {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id

	private Integer quantity
	private String product
	private BigDecimal price
}

