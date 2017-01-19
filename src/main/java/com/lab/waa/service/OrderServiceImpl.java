package com.lab.waa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.waa.Repository.ProductRepository;

import com.lab.waa.model.*;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	ProductRepository productRepository;
	
	@Override
	public void processOrder(String productId,long quantity)
	{
		Product orderdProduct = productRepository.getProductById(productId);
		
		if(orderdProduct != null)
		{
			if(quantity < orderdProduct.getUnitsInStock()){
				long currentStock = orderdProduct.getUnitsInStock() - quantity;
				orderdProduct.setUnitsInStock(currentStock);	
			}
			else
			{
				throw new IllegalArgumentException();
			}
		}
	}
}
