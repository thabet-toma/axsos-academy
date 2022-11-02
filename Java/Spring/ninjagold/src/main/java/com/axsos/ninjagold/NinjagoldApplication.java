package com.axsos.ninjagold;
import java.util.Random;


import javax.servlet.http.HttpSession;

import java.util.Date;
import java.util.ArrayList;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class NinjagoldApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(NinjagoldApplication.class, args);
	}
@RequestMapping("/")
public String home(HttpSession session) {
	if(session.getAttribute("goldSession")==null) {
		session.setAttribute("goldSession",0);}
	return "index.jsp";
	
}
@PostMapping("/process_money")
public String game(@RequestParam(value="which_form")String whichForm,HttpSession session) {
	Random rand = new Random();
	Date date=new Date();
	
	int[] y= {-1,1};
	int op=rand.nextInt(2);
	Integer opGame=y[op];
	if(session.getAttribute("data")==null) {
	ArrayList<String> data=new ArrayList<String>();
	session.setAttribute("data",data);
	}
	
	if(whichForm.equals("quest")) {
		Integer x=rand.nextInt(51);
		Integer gold=x*opGame;
		Integer increase=(Integer)session.getAttribute("goldSession")+gold;
		session.setAttribute("goldSession",increase);
		ArrayList <String>data1=(ArrayList <String>)session.getAttribute("data");
		if(opGame==1) {
		data1.add(0,"You completed a "+whichForm+"and earned "+x+date);}
		else {
			data1.add(0,"You faild a "+whichForm+"and lost "+x+date);
		}
		
		session.setAttribute("data",data1);
		
		}
	else {
		Integer x=rand.nextInt(10)+10;
		Integer increase=(Integer)session.getAttribute("goldSession")+x;
		session.setAttribute("goldSession",increase);
		ArrayList <String>data1=(ArrayList <String>)session.getAttribute("data");
				
				data1.add(0,"You entered a "+whichForm+"and earned "+x+date);
				
				
				
		session.setAttribute("data",data1);
		
		
	}
	return "redirect:/";
	}
}

