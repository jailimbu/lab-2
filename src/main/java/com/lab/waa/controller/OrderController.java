package com.lab.waa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lab.waa.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@RequestMapping(value="/orderProcess",method=RequestMethod.POST)
	public String processOrder(@RequestParam("productId") String productId, @RequestParam("count") int quantity)
	{
		orderService.processOrder(productId,quantity);
		return "redirect:/products";
	}
}
