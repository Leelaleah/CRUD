package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Dtoclass;
import com.example.demo.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

	static void save(Dtoclass cart) {
		// TODO Auto-generated method stub
		
	}

}
