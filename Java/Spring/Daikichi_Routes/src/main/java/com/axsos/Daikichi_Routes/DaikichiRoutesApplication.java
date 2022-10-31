package com.axsos.Daikichi_Routes;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/daikichi")
public class DaikichiRoutesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiRoutesApplication.class, args);
	}
	@RequestMapping("")
	public String index() {
		return "Welcome";
	}
	@RequestMapping("/today")
	public String today() {
		return"Today you will find luck in all your endeavors";
	}
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	@RequestMapping("/travel/{name}")
	public String name(@PathVariable("name") String name) {
		return "Congratulations! You will soon travel to'."+name;
	}
	@RequestMapping("/lotto/{num}")
	public String oddeven(@PathVariable("num") int num) {
		if(num%2==0) {
		return "You will take a grand journey in the near future, but be weary of tempting offers";
	}
		else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
			}
		}
	



}
