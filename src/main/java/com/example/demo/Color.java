package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Color {
	private String yourFavColor="Green";
	@GetMapping("/")
	public String getName()
	{
		return "My favorite color is "+ yourFavColor;
	}
}
