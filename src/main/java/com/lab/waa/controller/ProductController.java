package com.lab.waa.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lab.waa.Repository.ProductRepository;
import com.lab.waa.model.Product;
import com.lab.waa.service.ProductService;
import java.util.HashMap;

@Controller
public class ProductController {

	
	@RequestMapping(value="/disPrd", method=RequestMethod.GET)
	public String displayProducts(Model model)
	{
		ProductService prdService = new ProductService();
		HashMap<String,Product> prdAll = prdService.getProducts();
		model.addAttribute("products",prdAll);
		return "ProductsView";
	}
	
	@RequestMapping(value="/disPrdDetail/{prdId}", method=RequestMethod.GET)
	public String displayProductsDetail(@PathVariable("prdId") String prdId , Model model)
	{
		ProductService prdService = new ProductService();
		model.addAttribute("product",prdService.getProductDetail(prdId));
		return "ProductsDetail";
	}
	
	@Autowired
	ProductRepository inMemoryRepo;
	
	@RequestMapping(value="/products")
	public String getAllProducts(Model model)
	{
		model.addAttribute("products",inMemoryRepo.getAllProducts());
		return "products";
	}
}
