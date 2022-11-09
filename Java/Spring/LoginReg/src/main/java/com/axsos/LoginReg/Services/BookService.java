package com.axsos.LoginReg.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axsos.LoginReg.Repositories.BookRepository;
import com.axsos.LoginReg.models.Book;


@Service
public class BookService {
	 
    @Autowired
    private BookRepository bookRepo;
    public Book create(Book b) {
    	
    	 return bookRepo.save(b);
    	
    	
    }
    public List<Book> AllBooks(){
    	return bookRepo.findAll();
   }
    public Book findBook(Long id) {
    	Optional <Book> optional= bookRepo.findById(id);
    	return optional.get();
    }

public void updatebook( Book book) {
	// TODO Auto-generated method stub
	Optional <Book> optional=bookRepo.findById(book.getId());
	Book a=optional.get();
	a=book;
	bookRepo.save(a);
	
}
public void delete(Long id) {
	Optional <Book> optional=bookRepo.findById(id);
	bookRepo.delete(optional.get());
}}
