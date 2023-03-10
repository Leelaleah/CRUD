package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Dtoclass;
import com.example.demo.response.Response;
import com.example.demo.service.CartService;


@RestController

public class CartController {
	
	
	@Autowired
	private CartService cartService;
	
	@PostMapping("/addtocart")
	public Response add(@RequestBody Dtoclass dtoClass) {
		return cartService.add(dtoClass);
		
	}

	
	

}
