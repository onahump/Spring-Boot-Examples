package com.makingdevs.demo.dao

import com.makingdevs.demo.model.Invoice

/**
 * Created by nahum on 2/22/18.
 */
public class FakeInvoiceDaoImpl implements InvoiceDao {
    @Override
    int insertNewInvoice(UUID invoiceId, Invoice invoice) {
        return 0
    }

    @Override
    Invoice selectInvoiceById(UUID invoiceId) {
        return null
    }

    @Override
    List<Invoice> selectAllInvoices() {
        return null
    }

    @Override
    int updateInvoiceById(UUID invoiceId, Invoice invoiceUpdate) {
        return 0
    }

    @Override
    int deleteInvoiceById(UUID invoiceId) {
        return 0
    }
}
