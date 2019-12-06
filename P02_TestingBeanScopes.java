package com.slk.training.programs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.slk.training.dao.ProductDao;

public class P02_TestingBeanScopes {
	
	public static void main(String[] args) {
		System.out.println("created a new spring");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Context3.xml");
		System.out.println("spring container created successfully");
		System.out.println("getting a bean of type Product from spring container...");
		ProductDao dao1=ctx.getBean(ProductDao.class);
		ProductDao dao2=ctx.getBean(ProductDao.class);
		System.out.println("dao1==dao2 is ");
		ctx.close();
	}

}
