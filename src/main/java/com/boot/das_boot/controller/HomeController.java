package com.boot.das_boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
	
	@RequestMapping("/")
	public String root() {
		return "/";
	}
	@RequestMapping("/home")
	public String home() {
		return "/home";
	}
	
	@RequestMapping("/vineeth")
	public String vineeth() {
		return "/vineethxaviergcnfxngfxhgghnygx";
	}	
}