package com.axsos.SaveTravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.axsos.SaveTravels.models.Travel;
import com.axsos.SaveTravels.services.TravelService;

@Controller

public class TravelController {
private final TravelService travelService;

public TravelController(TravelService travelService) {
	
	this.travelService = travelService;
}

@GetMapping("/")
public String index(@ModelAttribute("travel") Travel travel ,Model model) {
	List <Travel>Travel= travelService.allExpence();
	model.addAttribute("Travel",Travel);
	return "index.jsp";
}
@PostMapping("/")
public String create(@Valid @ModelAttribute("travel") Travel travel,BindingResult result,Model model) {
	if(result.hasErrors()) {
		List <Travel>Travel= travelService.allExpence();
		model.addAttribute("Travel",Travel);
		return "index.jsp";
	}
	else {
		travelService.createExpense(travel);
		return "redirect:/";
	}

	
}

}
