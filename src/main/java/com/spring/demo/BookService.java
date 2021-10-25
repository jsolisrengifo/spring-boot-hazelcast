package com.spring.demo;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Cacheable("book")
	public String getBookById(int id) {
		return findBookSlowSource(id);
	}

	private String findBookSlowSource(int id) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Cien años de soledad";
	}
}
