package com.example.InvoiceApp.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.InvoiceApp.Service.InvoiceService;
import com.example.InvoiceApp.model.Invoice;
import com.example.InvoiceApp.repository.InvoiceRepository;

import io.swagger.annotations.Api;


// Add swagger to document the api http://www.springboottutorial.com/spring-boot-swagger-documentation-for-rest-services
@RestController
@Api
public class InvoiceController
{
	@Autowired
	private InvoiceService invoiceService;
	
	@RequestMapping(value = "/invoices" , method = RequestMethod.GET)
	public List<Invoice> getAllInvoices()
	{
		return invoiceService.viewAllInvoices();
		
	}
	//public ResponseEntity<Object> createStudent(@RequestBody Student student)
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<Object> createInvoice(@RequestBody Invoice invoice)
	{
		
		Invoice savedInvoice = invoiceService.addInvoice(invoice);
		
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedInvoice.getId()).toUri();

		return ResponseEntity.created(location).build();

		
	}
	 
	@RequestMapping(value="/invoice/{id}" , method = RequestMethod.GET)
	public Invoice getInvoice(@PathVariable("id") long id)
	{	
		return invoiceService.viewInvoice(id);
		
	}
	
	
}
