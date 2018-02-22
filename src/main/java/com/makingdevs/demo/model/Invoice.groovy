package com.makingdevs.demo.model

public class Invoice {

	private UUID id
	private Date date = new Date()
	private InvoiceEntity emitter
	private InvoiceEntity receiver
	private List<Concept> concepts

}