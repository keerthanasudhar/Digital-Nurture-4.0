package com.library.repository;

import java.util.ArrayList;

public class BookRepository {

	 ArrayList<String> books=new ArrayList<>();
	 public void saveBook(String bookName) {
	        System.out.println("Book saved: " + bookName);
	        books.add(bookName);
	    }
	 
	 public void getBooks()
	 {
		 System.out.println("Books Available :");
		 for(String b : books)
			 System.out.println(b);
		 
	 }
	 
	
}
