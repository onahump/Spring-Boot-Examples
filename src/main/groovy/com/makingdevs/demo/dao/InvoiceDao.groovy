package com.makingdevs.demo.dao

import org.springframework.data.repository.CrudRepository

import com.makingdevs.demo.model.Invoice
/*
public interface InvoiceDao {

    int insertNewInvoice(UUID invoiceId, Invoice invoice)

    Invoice selectInvoiceById(UUID invoiceId)

    List<Invoice> selectAllInvoices()

    int updateInvoiceById(UUID invoiceId, Invoice invoiceUpdate)

    int deleteInvoiceById(UUID invoiceId)
}
*/
interface InvoiceDao extends CrudRepository<Invoice, Long>{
	
}