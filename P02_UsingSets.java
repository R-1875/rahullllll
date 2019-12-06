package com.slk.training.programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.slk.training.entity.Book;

public class P02_UsingSets {
	
	public static void main(String[] args){
		Set <Book> books =new HashSet<Book>();
		Book b1 = new Book(1,"let us C",299,125);
		Book b2 = new Book(1,"let us C",299,125);
		
		System.out.println("b1.hashCode()=" +b1.hashCode());
		System.out.println("b2.hashCode()=" +b2.hashCode());
		System.out.println("b1.equals(b2)=" +b1.equals(b2));
		books.add(new Book(1,"let us C",299,125));
		books.add(new Book(2,"let us java",799,126));
		books.add(new Book(3,"let us C++",899,127));
		books.add(new Book(4,"let us python",499,128));
		books.add(new Book(5,"let us html ",599,129));
		System.out.println("book.size()" +books.size);
		for Book b
		
	}
	public static void test1(String[] args) {
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(123);
		nums.add(12);
		nums.add(222);
		nums.add(99);
		nums.add(108);
		System.out.println(nums);
		for(Integer n:nums){
			System.out.println(n);
		}
		System.out.println("number using iterator");
Iterator<Integer> itr = nums.iterator();
	while(itr.hasNext()){
		int n = itr.next();
		System.out.println(n);
	}
	
	}
}
