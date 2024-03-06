package com.thenxprogrammer.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class RestExceptionHandler  {
	@ExceptionHandler(CustomResponseException.class)
	public ResponseEntity<String> handleCustomResponseException(CustomResponseException e) {
		return new ResponseEntity<>(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
	}
}
