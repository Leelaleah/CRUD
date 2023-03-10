package com.example.demo.service;

import com.example.demo.dto.Dtoclass;
import com.example.demo.entity.Cart;
import com.example.demo.response.Response;

public interface CartService {

	Response add(Dtoclass dtoClass);

}
