package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.response.Response;

@ControllerAdvice
public class GlobalExceptionHandler {
@ExceptionHandler(value = CommonException.class)
public ResponseEntity<Response> exception(CommonException exception) {
	Response errorResponse = new Response();
	errorResponse.setStatus(exception.getStatus());
	errorResponse.setMessage(exception.getMessage());
	errorResponse.setHttpStatus(HttpStatus.BAD_REQUEST);

	return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
}
}
