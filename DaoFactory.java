package com.slk.training.dao;

public final class DaoFactory {

	private DaoFactory(){
		
	}
	
	
	public static ProductDao newProductDao(String type){
		switch(type.toLowerCase()){
		case "jdbc":
		return new ProductDaoJdbcImpl();
		case "file":
		return new ProductDaoFileImpl();
		case "array":
			return new ProductDaoArrayImpl();
			default:
				throw new RuntimeException("invalid discriminator value:" +type);
				
		}
	}
	
	public static ProductDao newProductDao(){
		return newProductDao("jdbc");
	}
}
