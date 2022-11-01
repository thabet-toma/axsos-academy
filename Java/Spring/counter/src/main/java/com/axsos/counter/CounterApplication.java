package com.axsos.counter;

import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class CounterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CounterApplication.class, args);
	}
@RequestMapping("/")
public String index(HttpSession session) {
	if (session.getAttribute("count") == null) {
		session.setAttribute("count", 0);
		}
		else {
		// increment the count by 1 using getAttribute and setAttribute
			Integer x=(Integer) session.getAttribute("count");
			x+=1;
			session.setAttribute("count",x);
		}
	return "index.jsp";
}
@RequestMapping("/counter")
public String count(Model model,HttpSession session) {
	model.addAttribute("cou",session.getAttribute("count"));
	return "count.jsp";
}
}
