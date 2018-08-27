package com.example.InvoiceApp.model;

import java.math.BigDecimal;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//Remove getters and setters and use lombook @Getter @Setter https://projectlombok.org/
public class LineItem {

	@Id
	@GeneratedValue
	private long id; // This is the line item id

	@ManyToOne(optional = false)
	private long invoiceId;  // The invoiceId is the one that must have  @ManyToOne annotation, meaning many line items have one invoice, you can also put a OneToMany on invoice to delete line items on invoice is deleted, the database can handle that if you dont mind the overhead
	private long quantity;
	private String description;
	private BigDecimal unitPrice;

	public LineItem(long quantity, String description, BigDecimal unitPrice) {
		super();
		this.quantity = quantity;
		this.description = description;
		this.unitPrice = unitPrice;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public BigDecimal getLineItemTotal() {
		BigDecimal lineItemTotal = unitPrice.multiply(new BigDecimal(quantity));
		return lineItemTotal;

	}

}
