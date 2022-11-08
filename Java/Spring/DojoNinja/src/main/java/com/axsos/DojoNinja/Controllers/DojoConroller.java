package com.axsos.DojoNinja.Controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.axsos.DojoNinja.models.Dojo;
import com.axsos.DojoNinja.models.Ninja;
import com.axsos.DojoNinja.services.DojoService;
@Controller
public class DojoConroller {
	private final DojoService dnService;
	public DojoConroller(DojoService dnService){
	     this.dnService = dnService;
	 }
	@GetMapping("/dojos/new")
	 public String index (@ModelAttribute("dojo") Dojo dojo ,Model model) {
	 	return "DojoNew.jsp" ;
	}
	 @PostMapping("/createdojo")
	 public String create (@Valid @ModelAttribute("dojo") Dojo dojo  , BindingResult result ,Model model) {
	 	  if (result.hasErrors()) {
	 		  
	           return "index.jsp";
	       } else {
	    	   dnService.createDojo(dojo);
	           return "redirect:/dojos/new";
	       }
	 }
		@GetMapping("/ninjas/new")
		 public String index1 (@Valid @ModelAttribute("ninja") Ninja ninja  , BindingResult result ,Model model) {
			model.addAttribute("AllDojos" , dnService.allDojos());
		 	return "NinjaNew.jsp" ;
		}
		 @PostMapping("/createNinja")
		 public String create (@Valid @ModelAttribute("ninja") Ninja ninja  , BindingResult result ,Model model) {
		 	  if (result.hasErrors()) {
		 		 model.addAttribute("AllDojos" , dnService.allDojos());
		           return "NinjaNew.jsp";
		       } else {
		    	   dnService.createNinja(ninja);
		           return "redirect:/ninjas/new";
		       }
		 }
		 
		 @GetMapping("/dojos/{id}")
		 public String index2(Model model , @PathVariable("id") Long id) {
			 Dojo thisDojo = dnService.findDojo(id);
			 model.addAttribute("ThisDojo" ,thisDojo );
			 return "show.jsp" ; 
		 }
		 
}
