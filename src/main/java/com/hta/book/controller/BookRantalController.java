package com.hta.book.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hta.book.repository.BookDto;
import com.hta.book.service.BookService;

public class BookRantalController {
	private BookService bookService;
	
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	@RequestMapping(value="/bookupdate", method=RequestMethod.GET)
	public ModelAndView changehandle(@RequestParam int book_num){
		ModelAndView mav = new ModelAndView("bookupdate");
		BookDto dto = bookService.findBynum(book_num);
		
		mav.addObject("dto", dto);
		return mav;
		
	}
}
