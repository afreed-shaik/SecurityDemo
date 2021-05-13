package com.ojas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/ojas/emps")
public class HelloController {
	
	@GetMapping("/sayHello")
	@ResponseBody
	public String sayHello() {
		return "hello ojas";
	}
}
