package com.example.Bookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



import org.springframework.ui.Model;
@Controller
public class BookController {
	
	@GetMapping("/hello")
	public String greeting() {			
		return "hello";
	}
}