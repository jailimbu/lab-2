package com.lab.waa.Repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.lab.waa.model.Product;

@Repository
public class InMemoryProductRepository implements ProductRepository{
	private final List<Product> listOfProduct;
	
	public InMemoryProductRepository()
	{
		listOfProduct = new ArrayList<>();
		
		Product watch = new Product();
		watch.setProductId("1");
		watch.setName("Watch");
		listOfProduct.add(watch);
		
		Product laptop = new Product();
		laptop.setProductId("2");
		laptop.setName("Dell Insperon");
		listOfProduct.add(laptop);
		
		Product mobile = new Product();
		mobile.setProductId("3");
		mobile.setName("Nexus 5");
		listOfProduct.add(mobile);
		
		Product printer = new Product();
		printer.setProductId("4");
		printer.setName("HP Printer");
		listOfProduct.add(printer);
	}
	
	@Override
	public List<Product> getAllProducts()
	{
		return listOfProduct;
	}
	
	@Override
	public Product getProductById(String productId){
		Product p = new Product();
		for(Product prd:listOfProduct)
		{
			if(productId.equals(prd.getProductId()))
				p = prd;
		}
		return p;
	}
}
