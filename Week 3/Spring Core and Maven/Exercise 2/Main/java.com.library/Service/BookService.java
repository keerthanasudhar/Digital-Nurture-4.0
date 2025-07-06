package com.library.service;
import com.library.repository.BookRepository;
public class BookService {
	 private BookRepository bookRepository;

	    // Setter for Spring to inject the dependency
	    public void setBookRepository(BookRepository bookRepository) {
	        this.bookRepository = bookRepository;
	    }

	    public void addBook(String bookName) {
	        bookRepository.saveBook(bookName);
	    }
	    public void getBooks()
	    {
	    	bookRepository.getBooks();
	    }
	    
}
