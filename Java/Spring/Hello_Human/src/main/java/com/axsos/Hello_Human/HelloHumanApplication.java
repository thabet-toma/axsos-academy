package com.axsos.Hello_Human;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.axsos.Hello_Human. HelloHumanApplication;

@SpringBootApplication
@RestController

public class HelloHumanApplication {

	public static void main(String[] args) {
		SpringApplication.run( HelloHumanApplication.class, args);

		
		
	}

	@RequestMapping("/")
	public String index(@RequestParam(value="name",required=false) String name,@RequestParam(value="l",required=false) String last_name,@RequestParam(value="n",required=false) int time) {
		String great=" ";
	
		if(name==null) {
			return "hello human";
		}
		else {
			for(int i=0;i<time;i++) {
				great+=name+" "+last_name;
			}
			return great;
		}
		
	}
}
