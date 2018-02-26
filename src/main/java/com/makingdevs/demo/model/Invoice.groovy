package com.makingdevs.demo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
public class Invoice {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private id

	private Date date = new Date()
	private InvoiceEntity emitter
	private InvoiceEntity receiver
	private List<Concept> concepts

}