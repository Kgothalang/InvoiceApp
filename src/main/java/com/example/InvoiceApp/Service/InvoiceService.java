package com.example.InvoiceApp.Service;

import java.util.List;

import com.example.InvoiceApp.model.Invoice;

public interface InvoiceService 
{
	Invoice addInvoice(Invoice invoice);
	Invoice viewInvoice(long id);
	List<Invoice> viewAllInvoices();
	
}
