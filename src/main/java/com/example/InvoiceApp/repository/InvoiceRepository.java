package com.example.InvoiceApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.InvoiceApp.model.Invoice;

@Repository("invoiceRepository")
public interface InvoiceRepository extends JpaRepository<Invoice,Long>
{

}
