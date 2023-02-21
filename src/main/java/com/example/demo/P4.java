package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class P4 {
	@Value("${thank.page}")
	private String test;
@GetMapping("/")
public String get()
{
	return "Welcome to  this "+test;
}

}
