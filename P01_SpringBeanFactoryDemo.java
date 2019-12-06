package com.slk.training.programs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.slk.training.dao.DaoException;
import com.slk.training.dao.ProductDao;


public class P01_SpringBeanFactoryDemo {
 public static void main (String[] args) throws DaoException{
	 ClassPathXmlApplicationContext ctx;
	 ctx= new ClassPathXmlApplicationContext("Context.xml");
	 
	 ProductDao dao = ctx.getBean("jdbc",ProductDao.class);
	 int pc = dao.count();
	 System.out.println("There are  " +pc+ " products");
	 
	 ctx.close();
 }
}
