package com.hta.book.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hta.book.service.BookService;

public class BookRantalController {
	private BookService bookService;
	
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	@RequestMapping("/rantal.book")
	public ModelAndView pageHandler(){
		ModelAndView mav = new ModelAndView("successbook");
		try {
			//Á¶°Ç
			List list = bookService.Condition();
			
			mav.addObject("list", list);
		} catch (Exception err) {
			System.out.println("ListController:pageHandler():" + err);
		}
	
		return mav;
		
	}
}
