package com.slk.training.dao;

public class ProductDaoArrayImpl implements ProductDao {

	@Override
	public void addProduct() {
          System.out.println("adding a product in an array");
	}

	@Override
	public void getProduct() {
System.out.println("gettinga product in an array");
	}

	@Override
	public void updateProduct() {
System.out.println("updating a product in an array");
	}

	@Override
	public void deleteProduct() {
System.out.println("deleting a product in an array");
	}

}
