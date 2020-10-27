package com.Spring1027.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample/*")
public class SampleController {

	@RequestMapping("/aaa")
	public void basic() {
		System.out.println("basic.............");
	}
	
	
}
