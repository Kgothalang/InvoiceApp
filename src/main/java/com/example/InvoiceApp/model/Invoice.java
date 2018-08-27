package com.example.InvoiceApp.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// Remove getters and setters and use lombook @Getter @Setter https://projectlombok.org/
@Entity
public class Invoice 
{

	@Id
	@GeneratedValue
	private Long id;
	private String client;
	private long vatRate;
	private Date invoiceDate;
	
	
	public Invoice() 
	{
		super();
	}


	public Invoice(String client, long vatRate, Date invoiceDate)
	{
		super();
		this.client = client;
		this.vatRate = vatRate;
		this.invoiceDate = invoiceDate;
	}

	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getClient() 
	{
		return client;
	}

	public void setClient(String client) 
	{
		this.client = client;
	}

	public long getVatRate() 
	{
		return vatRate;
	}

	public void setVatRate(long vatRate)
	{
		this.vatRate = vatRate;
	}

	public Date getInvoiceDate()
	{
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate)
	{
		this.invoiceDate = invoiceDate;
	}
	
	public BigDecimal getSubTotal() 
	{
		return null;
	}
	
	public BigDecimal getVat()
	{
		return null;
		
	}
	
	public BigDecimal getTotal()
	{
		return null;
		
	}
	
	

}
