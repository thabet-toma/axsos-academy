package com.axsos.quaries.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.axsos.quaries.services.HomeService;

@RestController
public class HomeControllers {
	@Autowired
	private HomeService Serv;

	@RequestMapping("/{lan}")
	public List<Object[]> findLan(@PathVariable("lan") String lan ){
		return Serv.findByLang(lan);
	}
	@RequestMapping("/numberOfCities")
	public List<Object[]> num(){
		return Serv.findCountryCitis();
	}
	@RequestMapping("/pop")
	public List<Object[]> pop(){
		return Serv.findpopulation();
	}
	@RequestMapping("/per")
	public List<Object[]> per(){
		return Serv.per();
	}
	@RequestMapping("/sur")
	public List<Object[]> sur(){
		return Serv.sur();
	}
	@RequestMapping("/life")
	public List<Object[]> life(){
		return Serv.life();
	}
	@RequestMapping("/dis")
	public List<Object[]> dis(){
		return Serv.dis();
	}
	@RequestMapping("/num")
	public List<Object[]> num1(){
		return Serv.num();
	}
}
