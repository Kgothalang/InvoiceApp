package com.example.InvoiceApp;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.InvoiceApp.model.Invoice;
import com.example.InvoiceApp.repository.InvoiceRepository;

@SpringBootApplication
public class InvoiceAppApplication {


	private static final Logger logger = LoggerFactory.getLogger(InvoiceAppApplication.class);
	private Date date = new Date();
	
	public static void main(String[] args) 
	{ 
		
		SpringApplication.run(InvoiceAppApplication.class, args);
	}
	
}
