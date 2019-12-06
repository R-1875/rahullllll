package com.slk.training.programs;

import java.util.Map;
import java.util.TreeMap;

import com.slk.training.entity.Book;

public class P03_UsingMaps {
	public static void main(String[] args) {
		Map<Integer, Book> books;
		books = new TreeMap<>();
		Book b1;
		b1 = new Book(728, "java unleashead", 459.0, 300);
		books.put(b1.getId(), b1);
		b1 = new Book(12, "authentic java", 299.0, 150);
		books.put(b1.getId(), b1);
		b1 = new Book(28, "java unleashead", 459.0, 300);
		books.put(b1.getId(), b1);
		b1 = new Book(8, "complete java ", 259.0, 400);
		books.put(b1.getId(), b1);
		b1 = new Book(8, "complete reference", 3459.0, 300);
		books.put(b1.getId(), b1);
		System.out.println("number of books = " + books.size());
		System.out.println("the books ARE: ");
		for (Book b : books.values()) {
			System.out.println(b);
		}
	}
}
