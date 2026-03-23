package com.app;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import com.model.Book;

public class App2 {

	static void displayAllBooks(LinkedHashMap<Integer, Book> miniLib) {

		Set<Map.Entry<Integer, Book>> books = miniLib.entrySet();
		Iterator<Map.Entry<Integer, Book>> itr = books.iterator();
		System.out.println(" ID     NAME   AUTOR   PRICE");
		while (itr.hasNext()) {
			Map.Entry<Integer, Book> entry = itr.next();
			System.out.print(entry.getKey() + "   "); // Integer
			Book book = entry.getValue();
			// System.out.println(entry.getValue()); // Book
			System.out.print(book.getName() + "  ");
			System.out.print(book.getAuthor() + "  ");
			System.out.println(book.getPrice() + "  ");
		}

	}

	public static void main(String[] args) {

		LinkedHashMap<Integer, Book> miniLib = new LinkedHashMap<Integer, Book>();
		Book book1 = new Book(111, "Let Us C", 444.44, "Yashwant Kanetakr");
		Book book2 = new Book(131, "Let Us C++", 454.44, "Yashwant Kanetakr");
		Book book3 = new Book(211, "Let Us Java", 544.44, "Yashwant Kanetakr");
		Book book4 = new Book(511, "Let Us C#", 447.44, "Yashwant Kanetakr");
		Book book5 = new Book(119, "Let Us Python", 494.44, "Yashwant Kanetakr");
		Book book6 = new Book(511, "Let Us C#", 447.44, "Yashwant Kanetakr");

		miniLib.put(book1.getId(), book1);
		miniLib.put(book2.getId(), book2);
		miniLib.put(book3.getId(), book3);
		miniLib.put(book4.getId(), book4);
		miniLib.put(book5.getId(), book5);
		miniLib.put(book6.getId(), book6);

		displayAllBooks(miniLib);

	}

}
