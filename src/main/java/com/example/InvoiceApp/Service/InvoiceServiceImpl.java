package com.example.InvoiceApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.InvoiceApp.model.Invoice;
import com.example.InvoiceApp.repository.InvoiceRepository;

@Service("invoiceService")
public class InvoiceServiceImpl implements InvoiceService{

	@Autowired
	InvoiceRepository invoiceRepository;
	
	@Override
	public Invoice addInvoice(Invoice invoice) 
	{
		return invoiceRepository.save(invoice);
	}

	@Override
	public Invoice viewInvoice(long id) 
	{
		
		return invoiceRepository.getOne(id);
	}

	@Override
	public List<Invoice> viewAllInvoices() 
	{
		
		return invoiceRepository.findAll();
	}

	
}
