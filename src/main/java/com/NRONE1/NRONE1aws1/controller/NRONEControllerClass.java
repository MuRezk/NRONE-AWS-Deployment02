package com.NRONE1.NRONE1aws1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NRONEControllerClass {
	
	@RequestMapping("/getname")
	public String getname() {
		return "New Relic TAM Interview";
	}

}
