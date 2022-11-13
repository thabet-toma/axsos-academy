package com.axsos.quaries.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axsos.quaries.repositories.CountryRepository;

@Service
public class HomeService {
	@Autowired
	private CountryRepository countryRepo;
public List<Object[]> findByLang(String lang) {
	return countryRepo.findCountryByLanguage(lang);
}
public List<Object[]> findCountryCitis() {
	return countryRepo.findCountryCityNumber();
}
public List<Object[]> findpopulation() {
	return countryRepo.population();
}
public List<Object[]> per() {
	return countryRepo.per();
}
public List<Object[]> sur() {
	return countryRepo.sur();
}
public List<Object[]> life() {
	return countryRepo.life();
}
public List<Object[]> dis() {
	return countryRepo.dis();
}
public List<Object[]> num() {
	return countryRepo.num();
}
}
