package com.slk.training.entity;

public class Product {
	private int id;
	private String name;
	private double price;
	
	
	public Product(){
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) throws InvalididException {
		if(id<0){
			throw new RuntimeException("invalid id");
		}
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) throws InvalidnameException{
		if(name==null||name.length()<3||name.length()>50){
			throw new RuntimeException("name cannot be blank");
		}
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) throws InvalidpriceException {
		if(price<0){
			throw new InvalididException("invalid price");
		}
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}


}