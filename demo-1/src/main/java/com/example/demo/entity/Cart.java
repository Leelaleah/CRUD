package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name  = "id")
	private int id;
	
	private String foodName;
	private String foodType;
	private String foodImage;
	private int foodPrice;
	 private int foodQuantity;
	    private int userId;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFoodName() {
			return foodName;
		}
		public void setFoodName(String foodName) {
			this.foodName = foodName;
		}
		public String getFoodImage() {
			return foodImage;
		}
		public void setFoodImage(String foodImage) {
			this.foodImage = foodImage;
		}
		public int getFoodPrice() {
			return foodPrice;
		}
		public void setFoodPrice(int foodPrice) {
			this.foodPrice = foodPrice;
		}
		public int getFoodQuantity() {
			return foodQuantity;
		}
		public void setFoodQuantity(int foodQuantity) {
			this.foodQuantity = foodQuantity;
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		
		public String getFoodType() {
			return foodType;
		}
		public void setFoodType(String foodType) {
			this.foodType = foodType;
		}
		public Cart() {
			super();
			
		}
		public Cart(int id, String foodName, String foodImage, int foodPrice, int foodQuantity, int userId) {
			super();
			this.id = id;
			this.foodName = foodName;
			this.foodImage = foodImage;
			this.foodPrice = foodPrice;
			this.foodQuantity = foodQuantity;
			this.userId = userId;
			this.foodType = foodType;
		}
	    
	
	    
	
	

}