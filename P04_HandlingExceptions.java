package com.slk.training.programs;

import com.slk.training.entity.Product;

public class P04_HandlingExceptions {

	public static void main(String[] args){
		try{
			Product p= new Product();
		p.setId(12);
		p.setName("acer travelmate laptop");
		p.setPrice(5000);
		System.out.println(p);
		}
		
		catch(RuntimeException e){
			System.out.println("error");
			
		}
	
	}

}
