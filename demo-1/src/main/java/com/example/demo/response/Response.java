package com.example.demo.response;

import org.springframework.http.HttpStatus;

public class Response {

	
	private int status;
	private String message;
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setHttpStatus(HttpStatus badRequest) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
