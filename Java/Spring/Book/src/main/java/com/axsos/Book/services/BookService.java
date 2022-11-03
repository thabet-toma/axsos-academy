package com.axsos.Book.services;

import java.util.List;
import java.util.Optional;

//...
import org.springframework.stereotype.Service;

import com.axsos.Book.models.Book;
import com.axsos.Book.repositories.BookRepository;

@Service
public class BookService {
 // adding the book repository as a dependency
	private final BookRepository bookRepository;

 public BookService(BookRepository bookRepository) {
     this.bookRepository = bookRepository;
 }
 // returns all the books
 public List<Book> allBooks() {
     return bookRepository.findAll();
 }
 // creates a book
 public Book createBook(Book b) {
     return bookRepository.save(b);
 }
 // retrieves a book
 public Book findBook(Long id) {
     Optional<Book> optionalBook = bookRepository.findById(id);
     if(optionalBook.isPresent()) {
         return optionalBook.get();
     } else {
         return null;
     }
 }
 public Book updateBook(long id, String title, String desc, String lang, Integer numOfPages) {
	 Optional<Book> optionalBook = bookRepository.findById(id);
     if(optionalBook.isPresent()) {
          optionalBook.get().setTitle(title);
          optionalBook.get().setDescription(desc);
          optionalBook.get().setLanguage(lang);
          optionalBook.get().setNumberOfPages(numOfPages);
         return bookRepository.save( optionalBook.get());
     } else {
         return null;
     }
	
   
 }
 public void deleteBook(long id) {
	 Optional<Book> optionalBook = bookRepository.findById(id);
     if(optionalBook.isPresent()) {
    	 bookRepository.delete(optionalBook.get());
    	 
     }
	 
 }
 
}


