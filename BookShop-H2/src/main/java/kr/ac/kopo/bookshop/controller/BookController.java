package kr.ac.kopo.bookshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.kopo.bookshop.model.Book;
import kr.ac.kopo.bookshop.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
	private final String path = "book/";
	
	@Autowired
	BookService service;
	
	@GetMapping("/list")
	String list(Model model) {
		List<Book> list = service.list();
		
		model.addAttribute("list", list);
		
		return path + "list";
	}
	
}
