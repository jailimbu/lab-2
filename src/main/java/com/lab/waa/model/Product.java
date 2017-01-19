package com.lab.waa.model;

import java.math.BigDecimal;

public class Product {
	
	private String productId;
	private String name;
	private BigDecimal unitPrice;
	private String description;
	private String manufacture;
	private String category;
	private long unitsInStock;
	private long unitsInOrder;
	private boolean discontinued;
	private String condition;
	
	public String getProductId()
	{
		return this.productId;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	
	public BigDecimal getUnitPrice()
	{
		return this.unitPrice;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	public String getManufacture()
	{
		return this.manufacture;
	}
	
	public String getCategory()
	{
		return this.category;
	}
	
	public long getUnitsInStock()
	{
		return this.unitsInStock;
	}
	
	public long getUnitsInOrder()
	{
		return this.unitsInOrder;
	}
	
	public boolean getDiscontinued()
	{
		return this.discontinued;
	}
	
	public String getCondition()
	{
		return this.condition;
	}
	
	
	public void setProductId(String productId)
	{
		this.productId = productId;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	
	public void setUnitPrice(BigDecimal unitPrice)
	{
		this.unitPrice = unitPrice;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public void setManufacture(String manufacture)
	{
		this.manufacture = manufacture;
	}
	
	public void setCategory(String category)
	{
		this.category = category;
	}
	
	public void setUnitsInStock(long unitsInStock)
	{
		this.unitsInStock = unitsInStock;
	}
	
	public void setUnitsInOrder(long unitsInOrder)
	{
		this.unitsInOrder = unitsInOrder;
	}
	
	public void setDiscontinued(boolean discontinued)
	{
		this.discontinued = discontinued;
	}
	
	public void setCondition(String condition)
	{
		this.condition = condition;
	}
	
	public Product()
	{

	}
	
	
	public Product(String productId,String name,BigDecimal unitPrice,String description,String manufacture,String category,long unitsInStock,long unitsInOrder,boolean discontinued,String condition)
	{
		this.productId = productId;
		this.name = name;
		this.unitPrice = unitPrice;
		this.description = description;
		this.manufacture = manufacture;
		this.category = category;
		this.unitsInStock = unitsInStock;
		this.unitsInOrder = unitsInOrder;
		this.discontinued = discontinued;
		this.condition = condition;
	}
}
