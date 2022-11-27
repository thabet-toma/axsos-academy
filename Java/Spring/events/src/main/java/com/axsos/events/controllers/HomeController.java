package com.axsos.events.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.axsos.events.models.Event;
import com.axsos.events.models.LoginUser;
import com.axsos.events.models.User;
import com.axsos.events.services.HomeService;

@Controller

public class HomeController {
	 
	    private final HomeService Serv;
	    
	  public HomeController(HomeService serv) {
			
			Serv = serv;
		}

	@GetMapping("/")
	    public String index(Model model) {
	        model.addAttribute("newUser", new User());
	        model.addAttribute("newLogin", new LoginUser());
	        return "index.jsp";
	    }
	    
	    @PostMapping("/register")
	    public String register(@Valid @ModelAttribute("newUser") User newUser, 
	            BindingResult result, Model model, HttpSession session) {
	        Serv.register(newUser, result);
	        if(result.hasErrors()) {
	            model.addAttribute("newLogin", new LoginUser());
	            return "index.jsp";
	        }
	        else {
	        session.setAttribute("userId", newUser.getId());
	        session.setAttribute("user", newUser);
	        return "redirect:/home";}
	    }
	    
	    @PostMapping("/login")
	    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
	            BindingResult result, Model model, HttpSession session) {
	        User user = Serv.login(newLogin, result);
	        if(result.hasErrors()) {
	            model.addAttribute("newUser", new User());
	            
	            return "index.jsp";
	        }
	        else {
	        session.setAttribute("userId", user.getId());
	        session.setAttribute("user", user);
	        return "redirect:/home";}
	    }
	    @GetMapping("/home")
	    public String index(Model model,HttpSession session ,@ModelAttribute("event") Event event) {
	    	User user=Serv.findUserById((Long)session.getAttribute("userId"));
	    	model.addAttribute("EventMyloc", Serv.EventMyloc(user.getLocation()));
	    	model.addAttribute("user",user);
	    	model.addAttribute("EventOtherLoc",Serv.EventNotloc(user.getLocation()));
	    	return "home.jsp";
	    }
	    @PostMapping("/CreateEvent")
	    public String CreateBook(@Valid @ModelAttribute("event") Event event, BindingResult result,Model model,HttpSession session)
	    {
	    		    	if(result.hasErrors()) {
	    		return "home.jsp";
	    	}
	    	else {
	    	
	    		
	    	
	    		Serv.createEvent(event);
	    		
	    		
	    		return"redirect:/home";
	    		
	    	}
	    }
	    @GetMapping("/edit/{id}")
	    public String edit(@PathVariable("id")Long id,Model model) {
	    	model.addAttribute("event", Serv.findProject(id));
	    	return "edit.jsp";
	    }
	    @PostMapping("/updateEvent/{id}")
	    public String updateEvent(@Valid @ModelAttribute("event") Event event, BindingResult result,Model model,HttpSession session)
	    {
	    		    	if(result.hasErrors()) {
	    		return "home.jsp";
	    	}
	    	else {
	    	List <User> a= new ArrayList<User>();	    	
	    	Event event1=Serv.findProject(event.getId());
	    	a=event1.getInvolveUsers();
	    		
	    	event.setInvolveUsers(a);
	    		Serv.createEvent(event);
	    		
	    		
	    		return"redirect:/home";
	    		
	    	}
	    }
	    @PostMapping("/join/{id}")
	    public String join(@PathVariable("id")Long id,HttpSession session) {
	    	Event event=Serv.findProject(id);
	    	User user=Serv.findUserById((Long)session.getAttribute("userId"));
	    	event.getInvolveUsers().add(user);
	    	Serv.createEvent(event);
	    	return "redirect:/home";
	    			
	    }
}
