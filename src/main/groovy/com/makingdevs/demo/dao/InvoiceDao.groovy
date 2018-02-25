package com.makingdevs.demo.dao

import com.makingdevs.demo.model.Invoice

public interface InvoiceDao {

    int insertNewInvoice(UUID invoiceId, Invoice invoice);

    Invoice selectInvoiceById(UUID invoiceId);

    List<Invoice> selectAllInvoices();

    int updateInvoiceById(UUID invoiceId, Invoice invoiceUpdate);

    int deleteInvoiceById(UUID invoiceId);
}