package com.slk.training.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.slk.training.dao.ProductDaoJdbcImpl;

@Configuration 
public class AppConfig1 {

	public AppConfig1() {
		System.out.println("AppConfig instantiated");
	}
	
	@Bean
(name={"jdbc","test"})
public ProductDaoJdbcImpl jdbc(){
			ProductDaoJdbcImpl dao=new ProductDaoJdbcImpl();
			dao.setDriver("org.h2.Driver");
			dao.setUrl("jdbc:h2:tcp://localhost/~/slk_training_2018_12");
			dao.setUser("sa" );
			dao.setPassword("");
			return dao;
		}
	}

