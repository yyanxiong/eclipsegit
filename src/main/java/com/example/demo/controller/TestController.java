package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
public class TestController {
	@RequestMapping("/a")
	public  String a() {
		String string ="123";
		System.out.println(123);
		System.out.println("主线xiong");
		System.out.println("解决冲突");
		System.out.println("pull上去");
		return string;
	}
}
