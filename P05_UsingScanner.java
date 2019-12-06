package com.slk.training.programs;

import java.util.Scanner;
@SuppressWarnings("resource")
public class P05_UsingScanner {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name of product");
		String name= sc.nextLine();
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter price of product");
		double price=sc.nextDouble();
		System.out.println("name=" +name);
		System.out.println("price="+price);
		System.out.println("id = " +id);
}

}
