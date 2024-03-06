package com.thenxprogrammer.demo.util;

import org.springframework.stereotype.Component;

import com.thenxprogrammer.demo.dto.ResponseDto;

@Component
public class SpringBootAppUtil {

	
	public ResponseDto response(Object message,Integer statusCode) {
		ResponseDto response = new ResponseDto();
		response.setMessgae(message);
		response.setStatus(statusCode);
		return response;
		
	}
}
