package com.makingdevs.demo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
public class InvoiceEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id

	private String businessName
	private String rfc
	private Address address
}