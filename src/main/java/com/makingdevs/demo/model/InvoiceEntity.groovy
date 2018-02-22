package com.makingdevs.demo.model

public class InvoiceEntity {
	
	private String businessName
	private String rfc
	private List<Concept> concepts

	public String toString(){
		"$businessName / $rfc" 
	}

}