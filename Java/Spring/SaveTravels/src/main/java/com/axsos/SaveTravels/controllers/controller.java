package com.axsos.SaveTravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.axsos.SaveTravels.models.Travel;
import com.axsos.SaveTravels.services.TravelService;

@Controller

public class controller {
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
@GetMapping("/edit/{id}")
public String edit(@ModelAttribute("travel") Travel travel ,Model model,@PathVariable("id") Long id) {
	Travel Traveledit= travelService.findTravel(id);
	model.addAttribute("Traveledit",Traveledit);
	return "edit.jsp";
}
@PutMapping("/edit/{id}")
public String editPost(@Valid @ModelAttribute("travel") Travel travel,BindingResult result,Model model,@PathVariable("id") Long id) {
	if(result.hasErrors()) {
		Travel Traveledit= travelService.findTravel(travel.getId());
		model.addAttribute("Traveledit",Traveledit);
		return"edit.jsp";
	}
	else {
		travelService.update(travel);
		return"redirect:/";
	}
}
@DeleteMapping("/delete/{id}")
public String delete(@PathVariable("id") Long id) {
	
	travelService.deleteTravel(id);
	return"redirect:/";
}
@GetMapping("/show/{id}")
public String show(Model model,@PathVariable("id") Long id) {
	model.addAttribute("Travel", travelService.findTravel(id));
	return "show.jsp";
}


}