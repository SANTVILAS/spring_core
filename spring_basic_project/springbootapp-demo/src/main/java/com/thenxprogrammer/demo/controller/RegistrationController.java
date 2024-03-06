package com.thenxprogrammer.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.thenxprogrammer.demo.dto.RegistrationDto;
import com.thenxprogrammer.demo.dto.ResponseDto;
import com.thenxprogrammer.demo.exception.CustomResponseException;
import com.thenxprogrammer.demo.exception.DuplicateEmailException;
import com.thenxprogrammer.demo.exception.DuplicateUserNameException;
import com.thenxprogrammer.demo.service.RegistrationService;

@RestController
public class RegistrationController {

	@Autowired
	@Qualifier("register")
	private RegistrationService registrationService;

	@PostMapping("registerUser")
	public ResponseEntity<String> registerUser(@RequestBody RegistrationDto registrationDto) {
		// System.out.println(request);
		// return "Registeration Successful..!!!";
		// System.out.println("Hello Controller");
		return registrationService.registerUser(registrationDto);
	}

	/*
	 * @ExceptionHandler(DataIntegrityViolationException.class) public
	 * ResponseEntity<String>
	 * handleDataIntegrityVoilationException(DataIntegrityViolationException e) {
	 * return new ResponseEntity<>("User Name already exist",
	 * HttpStatus.EXPECTATION_FAILED); }
	 */
	
	@ExceptionHandler(DuplicateEmailException.class)
	public ResponseEntity<String> handleDuplicateEmailException(DuplicateEmailException e) {
		return new ResponseEntity<>(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
	}
	
	@ExceptionHandler(DuplicateUserNameException.class)
	public ResponseEntity<String> handleDuplicateUserNameException(DuplicateUserNameException e) {
		return new ResponseEntity<>(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
	}
	
	@ExceptionHandler(CustomResponseException.class)
	public ResponseEntity<String> handleCustomResponseException(CustomResponseException e) {
		return new ResponseEntity<>(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
	}
	
	

}
