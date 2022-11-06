package com.axsos.Language.controller;

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

import com.axsos.Language.models.language;
import com.axsos.Language.servises.LanguageServise;



@Controller
public class LanguageController {
	private final LanguageServise languageServise;

	public LanguageController(LanguageServise languageServise) {
		
		this.languageServise = languageServise;
	}

	@GetMapping("/")
	public String index(@ModelAttribute("travel") language travel ,Model model) {
		List <language>Travel= languageServise.allLanguage();
		model.addAttribute("Travel",Travel);
		return "index.jsp";
	}
	@PostMapping("/")
	public String create(@Valid @ModelAttribute("travel") language travel,BindingResult result,Model model) {
		if(result.hasErrors()) {
			List <language>Travel= languageServise.allLanguage();
			model.addAttribute("Travel",Travel);
			return "index.jsp";
		}
		else {
			languageServise.createExpense(travel);
			return "redirect:/";
		}
}
	
	@GetMapping("/edit/{id}")
	public String edit(@ModelAttribute("travel") language travel ,Model model,@PathVariable("id") Long id) {
		language Traveledit= languageServise.findTravel(id);
		model.addAttribute("Traveledit",Traveledit);
		return "edit.jsp";
	}
	@PutMapping("/edit/{id}")
	public String editPost(@Valid @ModelAttribute("travel") language travel,BindingResult result,Model model,@PathVariable("id") Long id) {
		if(result.hasErrors()) {
			language Traveledit= languageServise.findTravel(travel.getId());
			model.addAttribute("Traveledit",Traveledit);
			return"edit.jsp";
		}
		else {
			languageServise.update(travel);
			return"redirect:/";
		}
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		
		languageServise.deleteTravel(id);
		return"redirect:/";
	}
	@GetMapping("/show/{id}")
	public String show(Model model,@PathVariable("id") Long id) {
		model.addAttribute("Travel", languageServise.findTravel(id));
		return "show.jsp";
	}


}
