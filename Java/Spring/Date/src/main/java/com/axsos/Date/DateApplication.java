package com.axsos.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;


@SpringBootApplication
@Controller
public class DateApplication {

	public static void main(String[] args) {
		SpringApplication.run(DateApplication.class, args);
	}
@RequestMapping("/")
public String home() {
	return "home.jsp";
	

	}

@RequestMapping("/date")
public String date(Model model) {
Date dat=new Date();
	DateFormat DateFor = new SimpleDateFormat("EEEEEE,'the' dd 'of' MMMM,yyyy");
String stringDate = DateFor.format(dat);
model.addAttribute("date",stringDate);
	return "date.jsp";
}
@RequestMapping("/time")
public String time (Model model) {
Date dat=new Date();
	DateFormat DateFor = new SimpleDateFormat("hh:mm:ss a ");
String stringDate = DateFor.format(dat);
model.addAttribute("time",stringDate);
	return "time.jsp";
}
}
