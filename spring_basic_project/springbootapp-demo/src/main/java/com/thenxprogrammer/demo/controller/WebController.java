package com.thenxprogrammer.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	@GetMapping("/welcome")
//	@ResponseBody
	public String welcome() {
		return "Welcome to the nextprogarmmer";
	}

}
