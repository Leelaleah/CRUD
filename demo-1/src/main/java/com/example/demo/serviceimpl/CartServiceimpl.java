package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.exception.CommonException;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Dtoclass;
import com.example.demo.entity.Cart;
import com.example.demo.repo.CartRepository;
import com.example.demo.response.Response;
import com.example.demo.service.CartService;

@Service
public  class CartServiceimpl implements CartService {
	
	@Autowired
	private CartRepository cartRepository;

	@Override
	public Response add(Dtoclass dtoclass) {
		
		validate(dtoclass);
		 Dtoclass cart = new  Dtoclass();
		cart.setFoodImage(dtoclass.getFoodImage());
	    
	    cart.setFoodName(dtoclass.getFoodName());
	    cart.setFoodPrice(dtoclass.getFoodPrice());
	    cart.setFoodQuantity(dtoclass.getFoodQuantity());
	    cart.setUserId(dtoclass.getUserId());
	    cart.setFoodType(dtoclass.getFoodType());
	    
		
		
		
		CartRepository.save(cart);
		
		Response response = new Response();
		response.setMessage("cart saved successfully");
		response.setStatus(200);
		return response;
	}

	public void validate(Dtoclass dtoClass) {
		if (dtoClass.getFoodName() == null || dtoClass.getFoodName().isEmpty()|| dtoClass.getFoodName().isBlank()) {
			throw new CommonException(200, "Foodname is Empty");
		}
		if (dtoClass.getFoodType() == null || dtoClass.getFoodType().isEmpty()|| dtoClass.getFoodName().isBlank())
				 {
			throw new CommonException(200, "Foodtype is Empty");
		}
		if (dtoClass.getFoodImage().isEmpty() || dtoClass.getFoodImage() == null|| dtoClass.getFoodImage().isBlank()) {
			throw new CommonException(200, "Foodimage is Empty");
		}
		if (String.valueOf(dtoClass.getFoodPrice()) == null || dtoClass.getFoodPrice()==0) {
			throw new CommonException(200, "Foodprice is Empty");
		}
		if (String.valueOf(dtoClass.getFoodQuantity()) == null || dtoClass.getFoodQuantity()==0) {
			throw new CommonException(200, "Foodquantity is Empty");
		}
		if (String.valueOf(dtoClass.getUserId()) == null || dtoClass.getUserId()==0) {
				throw new CommonException(200, "userid is Empty");
			
     }
	
}
}
		


