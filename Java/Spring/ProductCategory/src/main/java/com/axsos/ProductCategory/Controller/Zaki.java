package com.axsos.ProductCategory.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.axsos.ProductCategory.models.Category;
import com.axsos.ProductCategory.models.Product;
import com.axsos.ProductCategory.services.service;

@Controller
public class Zaki {
	@Autowired
	service serv;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("product", serv.allProducts());
		model.addAttribute("category", serv.allCategories());
		return "index.jsp";}
		
		
		
	
	@GetMapping("/Product/new")
	public String NewP(Model model,@ModelAttribute("product") Product product ) {
		
		return"newP.jsp";
	}
	@PostMapping("/newProduct")
	public String addProduct(@Valid @ModelAttribute("product") Product product,BindingResult result,Model model) {
		if(result.hasErrors()) {
			
			return "newP.jsp";
		}
		else {
			serv.createProduct(product);
			return "redirect:/";
		}
	}
	@GetMapping("/Category/new")
	public String NewC(Model model,@ModelAttribute("category") Category category ) {
		
		return"newC.jsp";
	}
	@PostMapping("/newCategory")
	public String addCategory(@Valid @ModelAttribute("category") Category category,BindingResult result,Model model) {
		if(result.hasErrors()) {
			
			return "newP.jsp";
		}
		else {
			serv.createCategory(category);
			return "redirect:/";
		}
	}
	
	@GetMapping("/product/{id}")
	public String showP(Model model,@ModelAttribute("product") Product product,@PathVariable("id") Long id ) {
		
		List<Category> categories=serv.AvelableC(id);
		model.addAttribute("categories",categories);
		model.addAttribute("product",serv.findProduct(id));
		return "showP.jsp";
		
	
	}
	@PostMapping("/AddCtoP")
	public String AddCtoP(Model model,@RequestParam("IdP") Long idP,@RequestParam("category") Long idC)
	{

			serv.updateP(idP, idC);
			return "redirect:/product/"+idP;
		}
	@GetMapping("/category/{id}")
	public String showC(Model model,@PathVariable("id") Long id ) {
		
		List<Product> products=serv.AvelableP(id);
		model.addAttribute("products",products);
		model.addAttribute("category",serv.findCategory(id));
		return "showC.jsp";
		
	
	}
	@PostMapping("/AddPtoC")
	public String AddPtoC(Model model,@RequestParam("IdC") Long idC,@RequestParam("category") Long idP)
	{

			serv.updateP(idP, idC);
			return "redirect:/category/"+idC;
		}
	}

