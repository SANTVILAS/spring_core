package com.thenxprogrammer.demo.service;

import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.thenxprogrammer.demo.dto.RegistrationDto;
import com.thenxprogrammer.demo.dto.ResponseDto;

public interface RegistrationService {

	public ResponseEntity<String> registerUser(RegistrationDto registrationDto);
}
