package com.axsos.ProjectManager.controlers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.axsos.ProjectManager.models.LoginUser;
import com.axsos.ProjectManager.models.Project;
import com.axsos.ProjectManager.models.User;
import com.axsos.ProjectManager.services.service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;



@Controller
public class HomeController {
	 @Autowired
	    private service Serv;
	   
	    
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
	    public String home(HttpSession session,Model model) {
	    	if( session.getAttribute("userId")!=null) {
	    		Long userId=(Long)session.getAttribute("userId");
	    		
	    		User user =Serv.findUserById(userId);
	    		
	    		List <Project> projects= Serv.ProectsNotJoined(user);
	            	model.addAttribute("projects",projects);
	            	model.addAttribute("myP", user.getInvolveProject());
	    	return "home.jsp";
	    }
	    	else {
	    		return "redirect:/";
	    		}
	    	}
	    @GetMapping("/logout")
	    public String logout(HttpSession session) { 
	            session.invalidate();
	            return "redirect:/";
	    
	}

	    @GetMapping("/projects/new")
	    
	    public String AddBook(@ModelAttribute("project") Project project,HttpSession session) {
	    	if( session.getAttribute("userId")!=null) {
	    	return"newProject.jsp";}
	    	else {
	    		return "redirect:/home";
	    	}
	    	
	    }
	    @PostMapping("/CreateProject")
	    public String CreateBook(@Valid @ModelAttribute("project") Project project, BindingResult result,Model model,HttpSession session)
	    {
	    	Date due=project.getDueDate();
	    	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
	    	String strDate = dateFormat.format(due); 
	    	LocalDate localDate = LocalDate.now(ZoneId.systemDefault());

			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate inputDate = LocalDate.parse(strDate, dtf);
			if(inputDate.isBefore(localDate)) {
				 result.rejectValue("dueDate", "Unique", "The date must be in future");
			}
	    	if(result.hasErrors()) {
	    		return "newProject.jsp";
	    	}
	    	else {
	    		User user=(User) session.getAttribute("user");
	    		List <User> a = new ArrayList <User>();
	    		a.add(user);
	    		project.setUserCreator(user);
	    		project.setInvolveUsers(a);
	    	
	    		Serv.create(project);
	    		
	    		
	    		return"redirect:/home";
	    		
	    	}
	    }
	    @PostMapping("/join/{idP}")
	    public String join(@PathVariable("idP") Long idP,HttpSession session) {
	    	Project project =Serv.findProject(idP);
	    	User user=(User) session.getAttribute("user");
	    	project.getInvolveUsers().add(user);
	    	Serv.create(project);
	    	return"redirect:/home";
	    	
	    }
	    @PostMapping("/Leave/{idP}")
	    public String leave(@PathVariable("idP") Long idP,HttpSession session) {
	    	Project project =Serv.findProject(idP);
	    	User user=(User) session.getAttribute("user");
	    	Serv.leave(project, user);
	    	
	    	
	    	

	    		    	return"redirect:/home";
	    }
	    @GetMapping("/update/{id}")
	    public String edit(Model model,@PathVariable("id")Long id)
	    {   
	    	
	    	 Project project=Serv.findProject(id);
	    	 Date due=project.getDueDate();
	    	 DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
		    	String strDate = dateFormat.format(due); 
		    	
	    	model.addAttribute("project",project);
	    	model.addAttribute("dt",strDate);

	    	
	    	return"edit.jsp";
	    }
	    @PostMapping("/editP")
	    public String editP(@Valid @ModelAttribute("project") Project project, BindingResult result,Model model,HttpSession session) {
	    	if(result.hasErrors()) {
	    		
	    		return "edit.jsp";
	    		}
	    	else {
	    		Serv.updateProject(project);
	    	
	    	return"redirect:/home";}}
	    @GetMapping("/project/{id}")
	    public String show(@PathVariable("id") Long id,Model model) {
	    	Project project =Serv.findProject(id);
	    			model.addAttribute(project);
	    	return "show.jsp";
	    }
	    @GetMapping("/delete/{id}")
	    public String delete(@PathVariable("id") Long id) {
	    	System.out.print(id);
	    	Serv.delete(id);
	    	return"redirect:/home";
	    }
	    
}
