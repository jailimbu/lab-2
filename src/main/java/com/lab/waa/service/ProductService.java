package com.lab.waa.service;

import java.util.HashMap;


import com.lab.waa.dao.ProductData;
import com.lab.waa.model.Product;

public class ProductService {

	
	public HashMap<String,Product> getProducts()
	{
		 ProductData prd = new ProductData();
		 return prd.getData(); 
	}
	
	public Product getProductDetail(String productId)
	{
		ProductService prdService = new ProductService();
		HashMap<String,Product> prdAll = prdService.getProducts();
		Product product = prdAll.get(productId);
		
		return product;
	}
}
