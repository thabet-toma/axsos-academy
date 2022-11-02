package com.axsos.form;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class app {
	@RequestMapping("/")
	public String form() {
		return "form.jsp";
	}
	@PostMapping("/show")
	public String show(@RequestParam(value="year")int year,@RequestParam(value="city")String city,
			@RequestParam(value="name")String name,@RequestParam(value="hoppy")String hoppy,
			@RequestParam(value="living")String living,HttpSession session,@RequestParam(value="com")String com) {
		session.setAttribute("year",year);
		session.setAttribute("city",city);
		session.setAttribute("name",name);
		session.setAttribute("hoppy",hoppy);
		session.setAttribute("living",living);
		session.setAttribute("com",com);
		return "redirect:/show1";
		
	}
	@RequestMapping("/show1")
	public String show1() {
		return "show.jsp";
	}
		
	
	
			
	

}
