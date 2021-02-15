package com.java.springboot.project.demo.Controller;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
@GetMapping("/")
public String getHomePage() {
	//System.out.println("hello");
	return "Welcome To Patel Parts"+LocalTime.now();
}
@GetMapping("/naveen")
public String getHomePageNaveen() {
	//System.out.println("hello");
	return "Welcome To Patel Parts"+LocalTime.now();
}
}
