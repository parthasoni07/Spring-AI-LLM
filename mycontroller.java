package com.ai.ai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class mycontroller {
	
	@RequestMapping("/getName")
	public String getName() {
		return "Parth";
	}

}
