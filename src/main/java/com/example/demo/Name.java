package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Name {
	private String studentName="IamNeo";
	   @GetMapping("/")
	   public String get1()
	   {
		   return "Welcome "+studentName+"!";
	   }
}
