package com.slk.training.dao;

public class ProductDaoFileImpl implements ProductDao {

	@Override
	public void addProduct() {
          System.out.println("adding a product in a file");
	}

	@Override
	public void getProduct() {
System.out.println("gettinga product in a file");
	}

	@Override
	public void updateProduct() {
System.out.println("updating a product in a file");
	}

	@Override
	public void deleteProduct() {
System.out.println("deleting a product in a file");
	}

}
