package com.slk.training.programs;

import com.slk.training.dao.DaoFactory;
import com.slk.training.dao.ProductDao;
//import com.slk.training.dao.ProductDaoFileImpl;

public class P03_TestingDaoFactory {
	public static void main(String[] args) {
		
		ProductDao dao;
		//dao = new ProductDaoFileImpl();
	dao = DaoFactory.newProductDao("array");
	dao.addProduct();
	dao.getProduct();
	dao.updateProduct();
	dao.deleteProduct();
	}
}
