package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
public class TestController {
	@RequestMapping("/a")
	public  String a() {
		String string ="123";
		return string;
	}
}
