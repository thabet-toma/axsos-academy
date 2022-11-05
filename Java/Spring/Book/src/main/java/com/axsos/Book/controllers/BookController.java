package com.axsos.Book.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsos.Book.models.Book;
import com.axsos.Book.services.BookService;


@Controller

public class BookController {
	 private final BookService bookService;
	    public BookController(BookService bookService){
	        this.bookService = bookService;
	    }
	 @RequestMapping("/books/{id}")
	    public String show(@PathVariable("id") Long id,Model model) {
	        Book book = bookService.findBook(id);
	        model.addAttribute("book",book);
	        return "ShowBook.jsp";

}
	    
	    @RequestMapping("/books")
	    public String index(Model model) {
	        List<Book> books = bookService.allBooks();
	        model.addAttribute("books", books);
	        return "index.jsp";
	    }
}