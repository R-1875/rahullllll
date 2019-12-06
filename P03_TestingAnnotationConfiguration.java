package com.slk.training.programs;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.slk.training.cfg.AppConfig4;
import com.slk.training.dao.DaoException;
import com.slk.training.dao.ProductDao;
import com.slk.training.entity.Product;
import com.slk.training.util.KeyBoardUtil;

public class P03_TestingAnnotationConfiguration {
	public static void main(String[] args) throws DaoException {
		AnnotationConfigApplicationContext ctx;
		ctx = new AnnotationConfigApplicationContext(AppConfig4.class);

		ProductDao dao = ctx.getBean("jdbc", ProductDao.class);
		Product p = new Product();
		int id = KeyBoardUtil.getInt("enter id");
		String name = KeyBoardUtil.getString("enter name");
		String category = KeyBoardUtil.getString("enter catagory");
		Double price = KeyBoardUtil.getDouble("enter price");
		p.setId(id);
		p.setName(name);
		p.setCategory(category);
		p.setPrice(price);
		dao.addProduct(p);

		ctx.close();
	}
}
