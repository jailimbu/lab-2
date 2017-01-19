package com.lab.waa.dao;

import java.util.HashMap;


import com.lab.waa.model.Product;



public class ProductData {
	
	public HashMap<String,Product> getData()
	{
		HashMap<String,Product> products = new HashMap<>();
		
		Product watch = new Product();
		watch.setProductId("1");
		watch.setName("Watch");
		products.put(watch.getProductId(),watch);
		
		Product laptop = new Product();
		laptop.setProductId("2");
		laptop.setName("Dell Insperon");
		products.put(laptop.getProductId(),laptop);
		
		Product mobile = new Product();
		mobile.setProductId("3");
		mobile.setName("Nexus 5");
		mobile.setUnitsInStock(50);
		products.put(mobile.getProductId(),mobile);
		
		Product printer = new Product();
		printer.setProductId("4");
		printer.setName("HP Printer");
		products.put(printer.getProductId(),printer);
		
		Product printer2 = new Product();
		printer2.setProductId("5");
		printer2.setName("HP Printer");
		products.put(printer2.getProductId(),printer2);
		
		return products;
	}

}
