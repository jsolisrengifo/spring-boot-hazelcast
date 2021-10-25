package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="/book/{id}", method=RequestMethod.GET)
    public String getBook(@PathVariable("id") int id){
        return bookService.getBookById(id);
    }
}
